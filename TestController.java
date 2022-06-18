package com.prodapt.week2;

public class TestController {
	public static void main(String[] args) {
		Employee obj = new Employee("sam", 24, "ASE Delivery");
		HR_Manager o1 = new HR_Manager();
		obj = o1.dispRecords(obj);
		o1.processRecords();

		Employee x = new Employee("jam", 23, "ASE Delivery");
		x = o1.dispRecords(x);
		o1.processRecords();

		Employee z = new Employee("khan", 52, "Delivery Head");
		z = o1.dispRecords(z);
		o1.processRecords();

		Employee b = new Employee("kapoor", 57, "Project Manager");
		b = o1.dispRecords(b);
		o1.processRecords();

		Employee a = new Employee("tiger", 58, "Team head");
		a = o1.dispRecords(a);
		o1.processRecords();

		}

		}
