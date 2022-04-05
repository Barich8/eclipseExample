package com.icraft;


class employee {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String empFirstname = "Jemes";
	String empLastName = "Fox";
	
	
	int empAge = 45;
	
	double empSalery = 2345.33;
	
	double empBonus = 300;
	
	double totalSalery = empSalery + empBonus;//2345.33 +300;

	
	System.out.println("Employee full name: " + empFirstname + " " + empLastName);
	System.out.println("Employee Age: + empAge");
	System.out.println("Employee Salery:" +empSalery);
	System.out.println("EmployeeBonus:" + empBonus);
	System.out.println("Employee Total Salery: " + totalSalery);
	
	}
}
