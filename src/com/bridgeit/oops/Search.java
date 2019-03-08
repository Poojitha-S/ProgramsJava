package com.bridgeit.oops;
import java.util.List;



import com.bridgeit.dto.Appointment;
import com.bridgeit.dto.Doctor;
import com.bridgeit.dto.Patient;

public class Search
{
	public boolean searchDocByName(String name, List<Doctor> doctorList)
	{
		int count = 0;
		boolean flag=false;
		for(Doctor doc:doctorList)
		{
			count = 0;
			if(doc.getName().equals(name))
			{
				System.out.println("\nDoctor Found!");
				System.out.println("Doctor name\tDoctor Id\tSpecialization\tAvailability");
				System.out.println(String.format("%-18s %-12d %8s %20s\n", doc.getName(), doc.getId(), doc.getSpecialization(), doc.getAvl()));
				flag=true;
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("\nDoctor not Found!");
		return flag;
	}
	
	public void searchDocById(int id, List<Doctor> doctorList)
	{
		int count = 0;
		for(Doctor doc:doctorList)
		{
			count = 0;
			if(doc.getId()==id)
			{
				System.out.println("\nDoctor Found!");
				System.out.println("Doctor name\tDoctor Id\tSpecialization\tAvailability");
				System.out.println(String.format("%-18s %-12d %8s %20s\n", doc.getName(), doc.getId(), doc.getSpecialization(), doc.getAvl()));
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("\nDoctor not Found!");
	}
	
	public void searchDocBySPL(String spl, List<Doctor> doctorList)
	{
		int count = 0;
		for(Doctor doc:doctorList)
		{
			count = 0;
			if(doc.getSpecialization().equals(spl))
			{
				System.out.println("\nDoctor Found!");
				System.out.println("Doctor name\tDoctor Id\tSpecialization\tAvailability");
				System.out.println(String.format("%-18s %-12d %8s %20s\n", doc.getName(), doc.getId(), doc.getSpecialization(), doc.getAvl()));
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("\nDoctor not Found!");
		
	}
	
	public void searchDocByAvl(String avl, List<Doctor> doctorList)
	{
		int count = 0;
		for(Doctor doc:doctorList)
		{
			count = 0;
			if(doc.getAvl().equals(avl))
			{
				System.out.println("\nDoctor Found!");
				System.out.println("Doctor name\tDoctor Id\tSpecialization\tAvailability");
				System.out.println(String.format("%-18s %-12d %8s %20s\n", doc.getName(), doc.getId(), doc.getSpecialization(), doc.getAvl()));
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("\nDoctor not Found!");

	}
	
	public boolean searchPatientByName(String name, List<Patient> patientList)
	{
		int count = 0;
		boolean flag=false;
		for(Patient patient:patientList)
		{
			count = 0;
			if(patient.getName().equals(name))
			{
				System.out.println("\nPatient Found!");
				System.out.println("Patient Name\tPatien Id\tMobile Number\tAge");
				System.out.println(String.format("%-18s %-12d %8s %20s\n", patient.getName(), patient.getId(), patient.getMobNumber(),patient.getAge()));
				flag=true;
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("Patient not found!");
		return flag;
	}
	
	public void searchPatientById(int id, List<Patient> patientList)
	{
		int count = 0;
		for(Patient patient:patientList)
		{
			count = 0;
			if(patient.getId()==id)
			{
				System.out.println("\nPatient Found!");
				System.out.println("Patient Name\tPatien Id\tMobile Number\t\tAge");
				System.out.println(String.format("%-18s %-12d %15s %10s\n", patient.getName(), patient.getId(), patient.getMobNumber(),patient.getAge()));
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("Patient not found!");
	}
	
	public void searchPatientByMobNum(String mobNum, List<Patient> patientList)
	{
		int count = 0;
		for(Patient patient:patientList)
		{
			count = 0;
			if(patient.getMobNumber().equals(mobNum))
			{
				System.out.println("\nPatient Found!");
				System.out.println("Patient Name\tPatien Id\tMobile Number\t\tAge");
				System.out.println(String.format("%-18s %-12d %15s %10s\n", patient.getName(), patient.getId(), patient.getMobNumber(),patient.getAge()));
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("Patient not found!");
	}
	
	public void searchPatientByAge(int age, List<Patient> patientList)
	{
		int count = 0;
		for(Patient patient:patientList)
		{
			count = 0;
			if(patient.getAge()==age)
			{
				System.out.println("\nPatient Found!");
				System.out.println("Patient Name\tPatien Id\tMobile Number\t\tAge");
				System.out.println(String.format("%-18s %-12d %15s %10s\n", patient.getName(), patient.getId(), patient.getMobNumber(),patient.getAge()));
				break;
			}
			else
				count++;
		}
		if(count != 0)
			System.out.println("Patient not found!");
	}
	
	public int getIndex(String searchName, List<Appointment> appointmentList)
	{
		int index = -1;
		for(int i = appointmentList.size()-1; i >= 0; i--)
		{
			String docName = appointmentList.get(i).getDoctorName();
			if(searchName.compareTo(docName) == 0)
			{
				index = i;
				break;
			}
		}
		return index;
	}
}
