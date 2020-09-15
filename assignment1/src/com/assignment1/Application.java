package com.assignment1;

public class Application {
	
	public static void main(String[] args)
	{
		Donor obj=new Donor(534,35,"James","A+");
		
		System.out.println(obj.getDonorName());
		System.out.println(obj.getDonorGroup());
		
		obj.setDonorGroup("B+");
		System.out.println(obj.getDonorGroup());
		
		System.out.println(obj);
	}

}
