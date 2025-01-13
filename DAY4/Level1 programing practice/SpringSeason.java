import java.util.Scanner; 

class SpringSeason {

public static boolean springSeason(int month,int day){

if ((month == 3 && day >= 20) ||  // March 20 or later
            (month == 4 && day >= 1 && day <= 30) ||  // April
            (month == 5 && day >= 1 && day <= 31) ||  // May
            (month == 6 && day >= 1 && day <= 20)) {  // June 20 or earlier
            return true;
        }
        return false; 
}		
public static void main(String[] args){
//create a scanner object 

Scanner scanner=new Scanner(System.in); 
 
 //Take a user input for months ; 
 System.out.println("Enter the month");
 int month=scanner.nextInt(); 
 
 //Take a user input for day  
 System.out.println("Enter the day"); 
 int day=scanner.nextInt(); 
  
  if(springSeason(month,day)){
  System.out.println("Its a SpringSeason"); 
  }else{
  System.out.println("Not a SpringSeason"); 
  } 
  }
   }
   