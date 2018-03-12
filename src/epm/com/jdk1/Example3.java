package epm.com.jdk1;

import java.util.Scanner;

public class Example3 { 
		
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int year = 0;
		int month =0;
		 
		  
       
	    System.out.print("Enter year: ");
	    
	    if (scn.hasNextInt()) { 
	    	year = scn.nextInt();  
	    } 
	    
        System.out.print("Enter month: ");
	    
	    if (scn.hasNextInt()) { 
	      month = scn.nextInt();  	  
	    } 
	calc(month,year);
	}
 public static void  calc(int month,int year )
 { 
	 int col_days=0;
	 switch (month) {  
	 case 1: 
		 case 3:  
			 case 5:  
				 case 7: 
					 case 8:  
						 case 10:  
							 case 12: 
								 col_days = 31; 
								 break; 
 								 
	 case 2: 
		 if (year % 4 == 0) { 
			 col_days = 29;  
		 } else {  
		 col_days = 28;   
		 }   
		 break;   
		 case 4: 
			 case 6:
				 case 9: 
					 case 11: 
						 col_days = 30;
						 break; 
						 } 
	 
	   System.out.println("number of the days - " + col_days); 							 
	 }
} 




	 

