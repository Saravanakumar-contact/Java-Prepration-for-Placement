public class reverse {
   public static void reverse(int a){
    while(a!=0){
    int reversed=0;
    int digit=a%10;
    reversed=reversed*10+digit;
    a/=10;
    System.out.print(reversed);
    }
    
   } 
   public static void main(String[] args) {
    reverse(122);
   }
}
