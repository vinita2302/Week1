import java.util.Scanner; 
class TemperaturConversion2{
public static void main(String[] args){

 //create a scanner object to take user input 
   Scanner scanner = new Scanner(System.in); 
    
	//create a fahrenheit  variable  
	System.out.println("enter the fahrenheit ");
	Double fahrenheit =scanner.nextDouble();  
	//calculate the result
	double celsius=(fahrenheit-32)*5/9; 
	 
  //print the result 
  System.out.println("The: "+ fahrenheit +" celsius is: "+celsius +"celsius"); 
  
  //close the scanner  
  scanner.close();
} 
}
