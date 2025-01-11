import java.util.Scanner; 
class TotalIncome{
public static void main(String[] args){
 
 //create a scanner object  
 Scanner scanner=new Scanner(System.in); 
 
 //create a variable named salary and take input 
System.out.println("enter the salary"); 
 double salary=scanner.nextDouble();  
 
 //create a variable named bonus and take input  
 System.out.println("enter the bonus"); 
 double bonus=scanner.nextDouble(); 
  
  //compute income 
  System.out.println("totalIncome is:"); 
 double totalIncome=salary+bonus; 
  
  //print the result 
  System.out.println("The salary is INR: " + salary +"and bonus is INR: "+ bonus+"  Hence Total Income is INR: "+totalIncome);  
  
  //close the Scanner  
  scanner.close();
  } 
  }
