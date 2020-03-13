package Sivaram_Examples;
public class Palindrome{  
public static void main(String args[]){  
String n="lail";  
char a=0;
char b=0;
for(int i=0; i<=n.length()-1; i++){
	System.out.println(n.charAt(i));
	a=n.charAt(i);

for(int j=n.length()-1;j>=0; j--){
	System.out.println(n.charAt(j));
	b=n.charAt(j);
}
}
if(a==b){
	System.out.println("palindrome");
}
else{
	System.out.println("not a palindrome");
}


}
}