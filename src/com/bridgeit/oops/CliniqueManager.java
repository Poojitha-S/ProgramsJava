package com.bridgeit.oops;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.dto.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



public class CliniqueManager 
{
	public static ObjectMapper objM = new ObjectMapper();
	Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String doctorFile = "/home/admin1/Desktop/JavaPrograms/src/com/bridgeit/resource/Doctor.json";
		String patientFile = "/home/admin1/Desktop/JavaPrograms/src/com/bridgeit/resource/Patient.json";
		String appointmentFile = "/home/admin1/Desktop/JavaPrograms/src/com/bridgeit/resource/Appointments.json";
		Doctor doctor = new Doctor();
		Patient patient = new Patient();	
		try 
		{
			int ch;
			List<Doctor> doctorList = objM.readValue(new File(doctorFile), new TypeReference<List<Doctor>>() {});
			List<Patient> patientList = objM.readValue(new File(patientFile), new TypeReference<List<Patient>>() {});
			List<Appointment> appointmentList = objM.readValue(new File(appointmentFile),new TypeReference<List<Appointment>>() {});
			do
			{
			System.out.println("Clinique Management");
			System.out.println("------------------------------");
			System.out.println("Press 1 : Add doctor");
			System.out.println("Press 2 : Add patient");
			System.out.println("Press 3 : See doctors");
			System.out.println("Press 4 : See patients");
			System.out.println("Press 5 : Search doctors");
			System.out.println("Press 6 : Search patients");
			System.out.println("Press 7 : Take appointment of doctor");
			System.out.println("Press 8 : Print appointment reports");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1: CliniqueUtility.addDoctor(doctorList);
						break;
					
				case 2: CliniqueUtility.addPatient(patientList);
						break;
						
				case 3:	System.out.println("Doctor name\tDoctor Id\tSpecialization\tAvailability");
						System.out.println("-------------------------------------------------------------");
						for(Doctor doc:doctorList)
							System.out.println(String.format("%-18s %-12d %8s %20s\n", doc.getName(), doc.getId(), doc.getSpecialization(), doc.getAvl()));
						break;
						
				case 4: System.out.println("Patient Name\tPatien Id\tMobile Number\tAge");
						System.out.println("-------------------------------------------------------------");
						for(Patient patience:patientList)
							System.out.println(String.format("%-18s %-12d %10s %8s\n", patience.getName(), patience.getId(), patience.getMobNumber(),patience.getAge()));
						break;
						
				case 5: CliniqueUtility.searchDoctors(doctorList);
						break;
					
				case 6: CliniqueUtility.searchPatients(patientList);
						break;
						
				case 7: CliniqueUtility.fixAppointment(doctorList, patientList);
						break;
						
				case 8: CliniqueUtility.printAppointments(appointmentList);
						break;
											
				default: System.out.println("Invalid Input! Try Again...");
						break;		
				
			}
			}while(ch!=8);
			
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
	public String inputString() {
		return sc.next();
	}
	public Integer inputInteger() {
		return sc.nextInt();
	}
}
