package com.bridgeit.oops;

import java.io.File;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.dto.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class CliniqueUtility 
{
	public static ObjectMapper objMapper = new ObjectMapper();
	public static Search search = new Search();
	public static Scanner sc=new Scanner(System.in);
	public static String doctorFile = "/home/admin1/Desktop/JavaPrograms/src/com/bridgeit/resource/Doctor.json";
	public static String patientFile = "/home/admin1/Desktop/JavaPrograms/src/com/bridgeit/resource/Patient.json";
	public static String appointmentFile = "/home/admin1/Desktop/JavaPrograms/src/com/bridgeit/resource/Appointments.json";
	
	public static void addDoctor(List<Doctor> doctorList) 
	{
		String avl ;
		System.out.println("Enter doctor's name: ");
		String name = sc.nextLine();
		System.out.println("Enter availability:");
		avl =sc.nextLine();
		System.out.println("Enter specialization:");
		String spl = sc.nextLine();
		System.out.println("Enter doctor's id:");
		int id=sc.nextInt();
		Doctor newDoctor = new Doctor(name,id,avl,spl);
		doctorList.add(newDoctor);
		try 
		{
			objMapper.writerWithDefaultPrettyPrinter().writeValue(new File(doctorFile), doctorList);
			System.out.println("Doctor name\tDoctor Id\tSpecialization\tAvailability");
			System.out.println("-------------------------------------------------------------");
			for(Doctor doc:doctorList){
				if(doc.getName().equals(name))
					System.out.println(String.format("%-18s %-12d %8s %20s\n", doc.getName(), doc.getId(), doc.getSpecialization(), doc.getAvl()));
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void addPatient(List<Patient> patientList)
	{
		System.out.println("Enter patient name: ");
		String name = sc.nextLine() ;
		System.out.println("Enter mobile number:");
		String mobNum = sc.nextLine();
		System.out.println("Enter patient's age:");
		int age = sc.nextInt();
		System.out.println("Enter patience's id:");
		int id=sc.nextInt();
		Patient newPatient = new Patient(name, id, mobNum, age);
		patientList.add(newPatient);
		
		try 
		{
			objMapper.writerWithDefaultPrettyPrinter().writeValue(new File(patientFile), patientList);
			System.out.println("\nNew Patient Added!\n");
			System.out.println("Patient Name\tPatien Id\tMobile Number\tAge");
			System.out.println("-------------------------------------------------------------");
			for(Patient patience:patientList)
				if(patience.getName().equals(name))
					System.out.println(String.format("%-18s %-12d %10s %8s\n", patience.getName(), patience.getId(), patience.getMobNumber(),patience.getAge()));
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static void searchDoctors(List<Doctor> doctorList)
	{
		int ch;
		do
		{
			System.out.println("Press 1 : To search by name of doctor");
			System.out.println("Press 2 : To search by ID of doctor");
			System.out.println("Press 3 : To search by specialization of doctor");
			System.out.println("Press 4 : To search by availability of doctor");
			System.out.println("Press 5 : To exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter doctor name: ");
						String name = sc.next() ;
						search.searchDocByName(name, doctorList);
						break;
						
				case 2: System.out.println("Enter doctor id: ");
						int id= sc.nextInt(); 
						search.searchDocById(id, doctorList);
						break;
				
				case 3: System.out.println("Enter specialization of doctor:");
						String spl = sc.next() ; 
						search.searchDocBySPL(spl,doctorList);
						break;
				
				case 4: System.out.println("Enter availability of doctor:");
						String avl =sc.next() ;
						search.searchDocByAvl(avl,	doctorList);
						break;
				
				default: System.out.println("Invalid choice");
			}
		}while(ch!=4);
	}
	
	public static void searchPatients(List<Patient> patientList)
	{
		int ch;
		do
		{
			System.out.println("Press 1 : To search by name of patient");
			System.out.println("Press 2 : To search by ID of patient");
			System.out.println("Press 3 : To search bymobile number of patient");
			System.out.println("Press 4 : To search by age of patient");
			System.out.println("Press 5 : To exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter patient name: ");
						String name = sc.next() ;
						search.searchPatientByName(name, patientList);
						break;
						
				case 2: System.out.println("Enter patience's id:");
						int id=sc.nextInt(); 
						search.searchPatientById(id, patientList);
						break;
				
				case 3: System.out.println("Enter mobile number:");
						String mobNum = sc.next();
						search.searchPatientByMobNum(mobNum, patientList);
						break;
				
				case 4: System.out.println("Enter patient's age:");
						int age = sc.nextInt();			 
						search.searchPatientByAge(age, patientList);
						break;
				
				default: System.out.println("Invalid choice");
			}
		}while(ch!=4);
	}
	
	public static void fixAppointment(List<Doctor> doctorList, List<Patient> patientList )		
	{
		try
		{
			List<Appointment> appointmentList = objMapper.readValue(new File(appointmentFile),new TypeReference<List<Appointment>>() {});
			System.out.println("Enter doctor name: ");
			String doctorName = sc.nextLine() ;
			if(search.searchDocByName(doctorName, doctorList) == true)
			{
				System.out.println("Enter patient name: ");
				String patientName = sc.nextLine() ;
				if(search.searchPatientByName(patientName, patientList) == true)
				{
					System.out.println("Enter date(DD/MM/YYYY):");
					String date = sc.nextLine();	
					int index = search.getIndex(doctorName, appointmentList);
					int count;
					
					System.out.println(index);
					if(index == -1)
					{
						count = 1;
					}
					else
					{
						count = appointmentList.get(index).getDocAppointmentCount();
						count = count + 1;
					}
					if(count <= 5)
					{
						Appointment newAppointment = new Appointment(doctorName, patientName, date, count );
						appointmentList.add(newAppointment);
						objMapper.writerWithDefaultPrettyPrinter().writeValue(new File(appointmentFile), appointmentList);
						System.out.println("\nAppointment Added!\n");
						System.out.println("Doctor Name\tPatient name\tDate of Appointment");
						System.out.println("-------------------------------------------------------------");
						for(Appointment appointment:appointmentList){
							if(appointment.getPatientName().equals(patientName))
								System.out.println(appointment.getDoctorName()+"\t\t  "+appointment.getPatientName()+"\t\t"+appointment.getDate());
						}
					}
					else
					{
						System.out.println("Doctor's appointment not available");
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void printAppointments(List<Appointment> appointmentList)
	{
		System.out.println("\n \t----List of Appointments----\n");
		System.out.println("Doctor Name\tPatient name\tDate of Appointment");
		System.out.println("-------------------------------------------------------------");
		for(Appointment appointment:appointmentList){
				System.out.println(appointment.getDoctorName()+"\t\t  "+appointment.getPatientName()+"\t\t"+appointment.getDate());
		}
	}
}
