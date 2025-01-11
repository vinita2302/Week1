import java.util.Scanner; 
class TemperaturConversion{
public static void main(String[] args){

 //create a scanner object to take user input 
   Scanner scanner = new Scanner(System.in); 
    
	//create a celsius variable  
	System.out.println("enter the celsius");
	double celsius=scanner.nextDouble();  
	//calculate the result
	double farenheitResult=(celsius*(9/5))+32; 
	 
  //print the result 
  System.out.println("The: "+celsius" celsius is: "+ farenheitResult +"fahrenheit"); 
  
  //close the scanner  
  scanner.close();
} 
}

