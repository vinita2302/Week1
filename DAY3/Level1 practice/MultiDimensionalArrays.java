import java.util.Scanner; 
class MultiDimensionalArrays{
public static void main(String[] args){

//create a scanner object 
Scanner scanner=new Scanner(System.in); 

System.out.println("enter the number for the row"); 
int rows=scanner.nextInt(); 

System.out.println("enter the number for the columns"); 
int columns=scanner.nextInt();

int matrix[][]=new int[rows][columns]; 
 
 //take the user input for the @D array 
 for(int i=0;i<rows;i++){
 for(int j=0;j<columns;j++){
  System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
		 
//create a 1D array to store the element of the 2D array 
int arr[]=new int[rows*columns]; 
int index=0; 

//copy elements from 2Darray to 1D array 
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
arr[index]=matrix[i][j]; 
index++; 
} 
} 

//display the 1D array 
 System.out.println("The 1D array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}