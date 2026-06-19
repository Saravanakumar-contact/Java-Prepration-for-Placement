import java.util.Scanner;

public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int in=sc.nextInt();
    if(in%2==0){
        System.out.println(in +" is Even");
    }
    else{
        System.out.println(in + " is odd");
    }
    sc.close();
    }
