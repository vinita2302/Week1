import java.util.Scanner; 
class HeightOfPlayers{
public static void main(String[] args){
//create a scanner  object 
Scanner scanner=new Scanner(System.in);  
double sum=0.0; 
double meanHeight;
 
//create a array 
double height[]=new double[11]; 

//take a user input 
for(int i=0;i<height.length;i++){
height[i] = scanner.nextDouble();
} 

//calculate the sum of the array 
for(int i=0;i<height.length;i++){
sum+=height[i]; 
} 
 //find the mean height by dividing the sum by the given number of element 
 meanHeight=sum/height.length; 
 
 //display the result 
 System.out.println("The mean height of the football team is:" + meanHeight); 
 }
  
  }