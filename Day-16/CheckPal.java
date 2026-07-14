import java.util.Scanner;

public class CheckPal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String arr=s.next();
        int left=0;
        int right=arr.length()-1;
        while(left<right){
       if(arr.charAt(left)!=arr.charAt(right)){
            System.out.println("Not Pallindrome");
            return;
        }
        left++;
        right--;
        System.out.println("Pallindrome");
    }}
}
