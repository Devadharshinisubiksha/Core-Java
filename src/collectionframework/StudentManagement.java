package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

import datahiding.Student;

public class StudentManagement {

public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	String name = null;
	String age;
	String salary;
	int ch;
	
	Scanner sc= new Scanner(System.in);
	while(true) {
		System.out.println("Press 1 to add student");
		System.out.println("Press 2 to display student");
		System.out.println("Press 3 to search student by name");
		System.out.println("Press 4 to delete student");
		System.out.println("Press 5 to exit");
		System.out.println("Enter your choice");
		
		ch= sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println( "Enter name");
			name = sc.next();
			System.out.println( "Enter age");
			age = sc.next();
			System.out.println( "Enter salary");
			salary = sc.next();
			Student s= new Student();
			s.setName(name);
			s.setAge(age);
			s.setSalary(salary);
			al.add(s);
			System.out.println("Student record added");
			break;

		
		case 2:
			for(int i=0;i<al.size();i++)
			{
				System.out.println("Student record"+(i+1));
				System.out.println("Student name:"+al.get(i).getName());
				System.out.println("Student age:"+al.get(i).getAge());
				System.out.println("Student salary:"+al.get(i).getSalary());
				break;
			}
				
				case 3:
					System.out.println("enter the student name for search ");
					name=sc.next();
					for(int i=0;i<al.size();i++) {
						if(al.get(i).getName().contains(name)) {
						System.out.println("student record"+(i+1));
						System.out.println("student name"+al.get(i).getName());
						System.out.println("student age:"+al.get(i).getSalary());
						}
						}
				case 4:
					System.out.println("enter the student name for delete");
					name=sc.next();
					int search=0;
				
					for(int i=0;i<al.size();i++) {
						if(al.get(i).getName().contains(name)) {
						System.out.println("student record"+(i+1));
						al.remove(i);
						}
						}
				case 5:
					System.exit(0);
					default:
						System.out.println("Invalid choice!!! Please make a valid choice");
						}
			}
		}
	}
