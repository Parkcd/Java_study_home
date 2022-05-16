package test;

import java.util.Scanner;

public class hakjum {

	public static void main(String[] args) {
		
		int a = 100;
		char myGrade;
		
		
		switch(a/10) {
		
		case 10:
		case 9:
			myGrade = 'A';
			break;
			
		case 8:
			myGrade = 'B';
			break;
			
		case 7:
			myGrade = 'C';
			break;
			
		case 6:
			myGrade = 'D';
			break;
			
		default:
			myGrade = 'F';
			break;	
		
		}
		System.out.println("학생의 학점은" + myGrade + "입니다");
		
	
		
	}

}
