import java.util.Scanner;

public class sumofarray {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Arrray Size : ");
        int n=input.nextInt();
        int[] sixe=new int[n];

        for(int i=0; i<sixe.length; i++){
            sixe[i]=input.nextInt();
        }
                int result=sixe[0];
        for(int i=0;i<sixe.length;i++){
            if(sixe[i]>result){
                result=sixe[i];
            }
        }
        System.out.println(result);
    }
    
}
