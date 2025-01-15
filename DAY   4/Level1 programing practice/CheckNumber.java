import java.util.Scanner; 
class CheckNumber{ 
//create a method to check the number is negative positive or zero 
public static int checkNumber(int number){
 
 if(number>0){
 System.out.println("number is positive: "); 
 return 1;
 } 
 else if(number<0){
 System.out.println("number is negative: "); 
 return -1; 
 }else{
 System.out.println("number is Zero: "); 
 return 0; 
 } 
 }
public static void main(String[] args){
//create a scanner object 
Scanner scanner=new Scanner(System.in); 

//take the use input 
int number=scanner.nextInt();  

System.out.println(checkNumber(number));  

//close the Scanner 
scanner.close();
} 
}
