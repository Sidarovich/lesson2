package epm.com.jdk1;

import java.util.Scanner;

public class Example2 { 
		
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int number = 0;   
		int poslZifra;   
    
    
	    System.out.print("Enter x: "); 
	    while(!scn.hasNextInt()){  
	    	number = scn.nextInt() ;
	    	poslZifra = number % 10;
	    	calc(poslZifra); 
	    	System.out.print("Enter x: "); 
	    } 
 
	}

 public static void  calc(int x)
 {   
	int fx; 
	int[] mass = {0,1,4,9,6,5,6,9,4,1};
	fx= mass[x];
    System.out.println("Square " + x + " =" + fx); 
} 
}



	 
