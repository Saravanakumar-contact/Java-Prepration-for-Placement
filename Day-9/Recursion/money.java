import java.util.Scanner;

public class money {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int amount=in.nextInt();
    int note10=amount/10;
    amount=amount%10;
   int note5=amount/5;
   amount=amount%5;
   int note2=amount/2;
   amount=amount%2;
   int note1=amount/1;
   amount=amount%1;
   System.out.println(note10);
   System.out.println(note5);
   System.out.println(note2);
   System.out.println(note1);

}}