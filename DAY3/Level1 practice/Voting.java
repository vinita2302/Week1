import java.util.Scanner; 

class Voting{
public static void main(String[] args){
 
 //create a scanner object 
 
 Scanner scanner=new Scanner(System.in); 
 
 //create a array 
 int array[] = new int[10];  
 //Get user input for the ages of 10 students
  
 for(int i=0;i<array.length;i++){ 
  System.out.print("Enter the age of student " + (i + 1) + ": ");
 array[i]=scanner.nextInt(); 
 }  
  // Loop through the array to check voting eligibility
  
  for(int i=0;i<array.length;i++){
  if(array[i] >=18){
  System.out.println("The student can vote with the age   "+ array[i]); 
  }else{
  System.out.println("The student with the age "+ array[i] + "cannot vote"); 
}  
  } 
  scanner.close();
} 
} 