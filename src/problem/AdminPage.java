package problem;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	Scanner sc = new Scanner(System.in); // public scanner
	ArrayList<Student> students = new ArrayList<>();
	private int nimCounter = 1;
	public Admin() {
		while(true){
			System.out.println("Welcome to admin page\n======");
			System.out.println("1. Insert Student Data");
			System.out.println("2. Update Student Data");
			System.out.println("3. Delete Student Data");
			System.out.println("4. Show Student Data");
			System.out.println("5. Exit");
			switch(sc.nextLine()) {
			case "1":
				System.out.println("1. Student Personal Data");
				System.out.println("2. Student Academic Data");
				switch(sc.nextLine()) {
				case "1":
					insertPersonal();sc.nextLine();
					break;
				case "2":
					insertAcademic();sc.nextLine();
					break;
				}
			break;
			
			case "2":
				System.out.println("1. Student Personal Data");
				System.out.println("2. Student Academic Data");
				switch(sc.nextLine()) {
				case "1": 
					updatePer();sc.nextLine();
					break;
				case "2": 	
					updateAca();sc.nextLine();
					break;
				}
			break;
			
			case "3":
				delete();sc.nextLine();
			break;
			
			case "4":
				show();  sc.nextLine();
			break;
			
			case "5":
				return;
			}
		}
		
	}
	
	private void show() {
		for (Student student : students) {
			if(students.equals(null)) {
				System.out.println("There is no Data");
				return;
			}
			System.out.println("===========================");
			studentView(student.personaldata);
			if(student.academicdata != null) {
				academicView(student.academicdata);
				System.out.println(" ");
			}
			
		}
		
	}
	
	private void studentView(PersonalData student) {
		System.out.print("Name: ");System.out.println(student.getName());
		System.out.print("Address: ");System.out.println(student.getAddress());
		System.out.print("DOB: ");System.out.println(student.getDOB());
		System.out.print("Email: ");System.out.println(student.getEmail());
		System.out.print("Phone Number: ");System.out.println(student.getPhoneNumber());
		System.out.println("===========================");
	}
	
	
	private void academicView(AcademicData academic) {
		System.out.print("NIM: ");System.out.println(academic.getNIM());
		System.out.print("Degree: ");System.out.println(academic.getDegree());
		System.out.print("Major: ");System.out.println(academic.getMajor());
		System.out.print("Class: ");System.out.println(academic.getKelas());
		System.out.println("===========================");
	}
	
	
	private void delete() {
		show();
		System.out.println("Name of student to be removed: ");
		String name = sc.nextLine();
		for(int i = 0 ;i<students.size();i++) {
			if(students.get(i).personaldata.getName().equals(name)) {
				System.out.println("Are you sure ? [Enter yes to proceed] : ");
				if(sc.nextLine().equalsIgnoreCase("yes")) {
					students.remove(i);
					System.out.println("Student Data has been deleted");
				}else {
					System.out.println("Name not found");
					return;
				}
			}
		}
	}
	
	private void updatePer() {
		show();
		System.out.println("Name of student to be updated: ");
		String name = sc.nextLine();
		for(int i = 0 ;i<students.size();i++) {
			if(students.get(i).personaldata.getName().equals(name)) {
				studentView(students.get(i).personaldata);
				System.out.println("What do you want to update ? [Address | Phone Number] :");
				switch(sc.nextLine().toLowerCase()) {
				case "address" :
					System.out.println("New Address : ");
					students.get(i).personaldata.setAddress(sc.nextLine());
					break;
				case "phone number" :
					System.out.println("New Phone Number : ");
					students.get(i).personaldata.setPhoneNumber(sc.nextLine());				
					break;
				}
				System.out.println("Data Updated Successfully!");
			}
			else System.out.println("Name not found");
		}
		
	}
	
	private void updateAca() {
		showAca();
		System.out.println("NIM of student to be updated: ");
		String Nim = sc.nextLine();
		for(int i = 0 ;i<students.size();i++) {
			if(students.get(i).academicdata.getNIM().equals(Nim)) {
				academicView(students.get(i).academicdata);
				System.out.println("What do you want to update ? [Major | Kelas]:");
				switch(sc.nextLine().toLowerCase()) {
				case "major" :
					System.out.println("New Major : ");
					students.get(i).academicdata.setMajor(sc.nextLine());
					break;
				case "kelas" :
					System.out.println("New Kelas : ");
					students.get(i).academicdata.setKelas(sc.nextLine());					
					break;
				}
				System.out.println("Data Updated Successfully!");
			}
			else System.out.println("NIM not found");
		}
	}
	
	
	private void insertPersonal() {
		System.out.print("Student Name: ");
		String name = sc.nextLine();
		System.out.print("Student DOB: ");
		String DOB = sc.nextLine();
		System.out.print("Student Address: ");
		String address = sc.nextLine();
		System.out.print("Student Phone Number: ");
		String phoneNumber;
		do {
			phoneNumber = sc.nextLine();
		}while(phoneNumber.length() != 12);
		//---------
		String[] names = name.split(" ");
		String email = String.format(names[0],".",names[names.length-1],"@binus.ac.id");
		//---------
		students.add(new Student(new PersonalData(name, DOB, address, email, phoneNumber)));
		System.out.println("Personal Data added successfully");
		
	}	
	
	private void showAca() {
		for (Student student : students) {
			if(student.academicdata != null)
				System.out.print("NIM: ");System.out.println(student.academicdata.getNIM());
				System.out.print("Degree: ");System.out.println(student.academicdata.getDegree());
				System.out.print("Major: ");System.out.println(student.academicdata.getMajor());
				System.out.print("Class: ");System.out.println(student.academicdata.getKelas());
				System.out.println("===========================");
		}
		
	}

	private void insertAcademic(){
		int index = getStudent(); sc.nextLine();
		String nIM = Integer.toString(nimCounter++);
		//---------
		System.out.println("Degree: ");
		String degree = sc.nextLine();
		System.out.println("Major :");
		String major = sc.nextLine();
		System.out.println("Class : ");
		String kelas = sc.nextLine();
		//---------
		students.get(index).academicdata = new AcademicData(nIM, degree, major, kelas);
		System.out.println("Academic Data added successfully");
		
	}
	
	private int getStudent() {
		int count = 1;
		for (Student student : students) {
			System.out.printf("%d. %s\n", count++ , student.personaldata.getName());
		}
		System.out.println("Input Student Number: " );
		return sc.nextInt() - 1;
	}
}