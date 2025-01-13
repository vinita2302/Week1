class Handshakes{ 
public int handshakes(int number ){
  int result=(number*(number-1))/2; 
return result;  
  }
public static void main(String[] args){ 
//create a variable and initialize that
int number=12;   
Handshakes hs=new Handshakes();
System.out.println("Number of handshakes:" + hs.handshakes(number));  
} 
}

 
 