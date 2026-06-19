import java.util.Scanner;

public static void main(String arg[]){
    Scanner in= new Scanner(System.in);
    System.out.print("Enter the valu to Swap : ");
    int a=in.nextInt();
    int b=in.nextInt();
    int temp=a;
    b=a;
    temp=b;
    System.out.print(a);
    System.out.println(b);
}