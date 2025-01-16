import java.util.Scanner; 

class Counter{ 

public static int[] calculateVowelConsonant(String text){ 
//count the number of vowels and consonants in the string 
int vowel=0;  
int consonant=0;
for(int i=0;i<text.length();i++) 
{
char ch=text.trim().charAt(i); 
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
vowel++; 
}else{
consonant++; 
} 
}
return new int[]{vowel,consonant};  
 }
	
public static void main(String[] args){ 
//create a scanner object
Scanner scanner=new Scanner(System.in);  
 
//Take a string input  
System.out.println("Enter the string");
String text=scanner.nextLine(); 

int result[]=calculateVowelConsonant(text);

//display the result 
System.out.println("Number of vowels: "+result[0]+" Number of consonants: "+result[1]); 
} 
}
