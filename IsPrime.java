package Sivaram_Examples;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=Integer.parseInt(args[0]);
		 boolean prime=true;
		if(a==0||a==1){
			System.out.println("not a prime");
		}else{
		for(int i=2; i<=a/2; i++){
			if(a%i==0){
				prime=false;
			}
		}
			if(prime){
				System.out.println("is prime");
			}
			else{
				System.out.println("not prime");
			}
		}
	
		

	}
}


