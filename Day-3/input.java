import java.util.Scanner;

public static void main(String args[]){
    System.out.println("Enter the Sixe of the array");
    Scanner in=new Scanner(System.in);
    int sixe=in.nextInt();
    int[] arr=new int[sixe];
    for(int i=0; i<sixe; i++){
        arr[i]=in.nextInt();  
        System.out.println(arr[i]);
    }
    
}