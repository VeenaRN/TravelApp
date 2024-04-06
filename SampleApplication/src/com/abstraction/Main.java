package com.abstraction;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		 Hosteller hosteller = getHostellerDetails();
		 
		 System.out.println("Original Hosteller Details:");
	        displayDetails(hosteller);

	       
//	        hosteller.setRoomNumber(101); 
//	        hosteller.setPhone("9876543210"); 
	        modifyDetails( hosteller);
	        
	        System.out.println("\nModified Hosteller Details:");
	        displayDetails(hosteller);
	    }
		 
	
	
	
	
	public static Hosteller getHostellerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        int sId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Department ID:");
        int depId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter Phone:");
        String phone = scanner.nextLine();

        System.out.println("Enter Hostel Name:");
        String hostelName = scanner.nextLine();

        System.out.println("Enter Room Number:");
        int roomNumber = scanner.nextInt();

        
        return new Hosteller(sId, name, depId, gender, phone, hostelName, roomNumber);
	}
	
	
	public static void modifyDetails(Hosteller hosteller) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("\nModify Room Number (Y/N):");
	    char modifyRoom = scanner.nextLine().charAt(0);
	    if (modifyRoom == 'Y' || modifyRoom == 'y') {
	        System.out.println("Enter New Room Number:");
	        int newRoomNumber = scanner.nextInt();
	        hosteller.setRoomNumber(newRoomNumber);
	    }

	    System.out.println("Modify Phone Number (Y/N):");
	    char modifyPhone = scanner.next().charAt(0); 
	    scanner.nextLine(); 
	    if (modifyPhone == 'Y' || modifyPhone == 'y') {
	        System.out.println("Enter New Phone Number:");
	        String newPhone = scanner.nextLine();
	        hosteller.setPhone(newPhone);
	    }
	}



    
    public static void displayDetails(Hosteller hosteller) {
        System.out.println("Student ID: " + hosteller.getStudentId());
        System.out.println("Name: " + hosteller.getName());
        System.out.println("Department ID: " + hosteller.getDepartmentId());
        System.out.println("Gender: " + hosteller.getGender());
        System.out.println("Phone: " + hosteller.getPhone());
        System.out.println("Hostel Name: " + hosteller.getHostelname());
        System.out.println("Room Number: " + hosteller.getRoomNumber());
    }
}


