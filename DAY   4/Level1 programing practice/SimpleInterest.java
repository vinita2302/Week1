import java.util.Scanner; 
class SimpleInterest{ 

public static double simpleCalculator(double p,double r,double t){ 
//calculate the result
double result=(p*r*t)/100;  
return result;
}
public static void main(String[] args){
//create a scanner object 
Scanner scanner=new Scanner(System.in); 

//Take a user input 
System.out.println("Enter the principal: "); 
double principal=scanner.nextDouble();  
System.out.println("Enter the rate: "); 
double rate=scanner.nextDouble();  
System.out.println("Enter the time: "); 
double time=scanner.nextDouble();   

double result=simpleCalculator(principal,rate,time);
 
 System.out.println("The simple interest is: "+result+" for principal: "+ 
 principal+"rate of Interest: "+rate+"and time: "+time); 
 }
 } 

 
 

