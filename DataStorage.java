package StudentDataFinal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DataStorage {
	public static void main(String[] args) {
		List<studentData> stuDataList = new LinkedList<>();
		Scanner scnr= new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Student Info to add to List. Type X to exit");
			
			System.out.println("Student Name: ");
			String studentName = scnr.nextLine();
			
		
			
			if(studentName.equalsIgnoreCase("X")) {
				break;
			}
			
			System.out.println("Primary Address: ");
			String address = scnr.nextLine();
			
			System.out.println("GPA: ");
			double GPA = scnr.nextDouble();
			scnr.nextLine();
		
		
			
			studentData studentinfo = new studentData(studentName, address, GPA);
			stuDataList.add(studentinfo);
	
		}
		
		Collections.sort(stuDataList, (s1, s2) -> s1.getstudentName().compareTo(s2.getstudentName()));
	
		
		
		 try (FileWriter writer = new FileWriter("student_data.txt")) {
	            for (studentData studentinfo : stuDataList) {
	                writer.write(studentinfo.toString());
	            }
	            System.out.println("Student data has been written to student_data.txt.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
	

			
			
			
			
		} 
		
		
	}

