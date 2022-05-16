package test;

import java.util.Scanner;

public class GradeInfo {

	public static void main(String[] args) {
		
		int kuk[] = {95,70,45,60,83}; 
		int eng[] = {95,70,45,60,83}; 
		int mat[] = {95,70,45,60,83}; 
		int sum[] = new int[5];
		int max = 0;
		int min = 999;
		String[] name = {"aaa","bbb","ccc","ddd","eee"};
		int myRank[] = new int[5];
		char gread[] = new char[5];
		
		for(int i=0; i<name.length; i++) {
			sum[i] = kuk[i]+eng[i]+mat[i];
			
			if(sum[i] > max) max = sum[i]; 
			if(sum[i] < min) min = sum[i];
			
			switch(kuk[i]/10) {
			case 10:

			case 9:
				gread[i] = 'A';
				break;
			case 8:
				gread[i] = 'B';
				break;
			case 7:
				gread[i] = 'D';
				break;
			case 6:
				gread[i] = 'E';
				break;
			default :
				gread[i] = 'F';
			}
		}
		
		for(int i=0; i<name.length; i++) {
			myRank[i] = 1;
			for(int j=0; j<name.length; j++) {
				if(sum[i]<sum[j])
					myRank[i] ++;
			}
			
		}
					
		System.out.println("-------------------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t등급\t등수");
		System.out.println("-------------------------------------------------------------");
		for(int i=0; i<name.length; i++) 
			System.out.println((i+1) + "\t" + name[i] + "\t" + kuk[i] + "\t" + 
		eng[i] + "\t" + mat[i] + "\t" + sum[i] + "\t" + gread[i] + "\t" + myRank[i] );
		
	
	}

}