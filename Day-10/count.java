import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int count=0;
        int[] arr={1,2,3,4,5,5,5,5,5,5,6,6,7,7,7};
        for(int i=0;i<arr.length;i++){
            if (arr[i]==a) {
                count+=1;
            }
            
        }
        System.out.println(a +"-"+count);
    }
}
