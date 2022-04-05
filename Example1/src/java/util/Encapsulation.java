package java.util;

//package com.icraftjava;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//"Employee info" = new "Employee info();
		
		class Encapsulation1 {
			private String fname;
			private String lname;
			private int age;
			private double salary;
			private double bonus;
			public String getFname() {
				return fname;
			}
			public void setFname(String fname) {
				this.fname = fname;
			}
			public String getLname() {
				return lname;
			}
			public void setLname(String lname) {
				this.lname = lname;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				if (age >= 18) {
					this.age = age;
				}
			}
			public double getSalary() {
				return salary;
			}

			public void setSalary(double salary) {
				this.salary = salary;
			}
			public double getBonus() {
				return bonus;
			}
			public void setBonus(double bonus) {
				this.bonus = bonus;
			}
		}
		
		
		//public class EncapsulationClass1 {
			//public static void main(String[] args) {
				// TODO Auto-generated method stub
				Encapsulation1 encap = new Encapsulation1();
				encap.setFname("James");
				encap.setLname("jone");
				encap.setAge(23);
				encap.setSalary(30000);
				encap.setBonus(2000);
				System.out.println(encap.getFname());
				System.out.println(encap.getLname());
				System.out.println(encap.getAge());
				System.out.println(encap.getSalary());
				System.out.println(encap.getBonus());
			}
		}







		
		
		
		
		
	


