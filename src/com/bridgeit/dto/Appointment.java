package com.bridgeit.dto;


public class Appointment 
{
	private String doctorName;
	private String patientName;
	private String date;
	private int docAppointmentCount;

	public Appointment()
	{
		
	}
	
	public Appointment(String docName, String patientName, String date, int docCount)
	{
		this.setDoctorName(docName);
		this.setPatientName(patientName);
		this.setDate(date);
		this.docAppointmentCount = docCount;
	}
	
	public String getDoctorName()
	{
		return doctorName;
	}
	
	public void setDoctorName(String doctorName) 
	{
		this.doctorName = doctorName;
	}
	
	public String getPatientName()
	{
		return patientName;
	}
	
	public void setPatientName(String patientName)
	{
		this.patientName = patientName;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date) 
	{
		this.date = date;
	}
	
	public int getDocAppointmentCount() {
		return docAppointmentCount;
	}

	public void setDocAppointmentCount(int docCount) {
		this.docAppointmentCount = docCount;
	}
}
