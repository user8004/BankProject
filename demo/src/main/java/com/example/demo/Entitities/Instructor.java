package com.example.demo.Entitities;

public class Instructor 
{
	private long InstructorId;
	private String Email;
	private String InstructorName;
	private String PartnerName;
	private String ContactNo;
	public Instructor(long instructorId, String email, String instructorName, String partnerName, String contactNo) 
	{
		super();
		InstructorId = instructorId;
		Email = email;
		InstructorName = instructorName;
		PartnerName = partnerName;
		ContactNo = contactNo;
	}
	public long getInstructorId()
	{
		return InstructorId;
	}
	public void setInstructorId(long instructorId)
	{
		InstructorId = instructorId;
	}
	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String email)
	{
		Email = email;
	}
	public String getInstructorName() 
	{
		return InstructorName;
	}
	public void setInstructorName(String instructorName)
	{
		InstructorName = instructorName;
	}
	public String getPartnerName()
	{
		return PartnerName;
	}
	public void setPartnerName(String partnerName) 
	{
		PartnerName = partnerName;
	}
	public String getContactNo() 
	{
		return ContactNo;
	}
	public void setContactNo(String contactNo)
	{
		ContactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Instructor [InstructorId=" + InstructorId + ", Email=" + Email + ", InstructorName=" + InstructorName
				+ ", PartnerName=" + PartnerName + ", ContactNo=" + ContactNo + "]";
	}
	
	
	

}
