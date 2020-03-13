package Sivaram_Examples;
import java.util.Scanner;
public class Sumdigits {
   public static void main(String args[]) {
	   System.out.println("Enter a number:");
	        Scanner sc=new Scanner(System.in);
	        String n=sc.nextLine();
	        int a=Integer.parseInt(n);
	        
	       
	        int s=0;
	       
	        System.out.println(a);
	        
	        if(n.length()>4 || n.length()<4){
	            System.out.println("enter only 4 digit number");
	            
	        }
	    else
	    {
	   while(a!=0){
	    	s+=a%10;
	    	a=a/10;
	      
	    }
	    }
	    System.out.println(s);
	}
	    
}
