public class Task3 {
  static int SumofNum(int a){
    if(a==0) return 0 ;
    return a+SumofNum(a-1);    
    }
    static void Sumof(int a, int sum){
        if(a==0){
        System.out.println(sum);
        return ;
        }
        sum=sum+a;
        Sumof(a-1,sum);
    }
    public static void main(String[] args) {
        System.out.println(SumofNum(5));
        Sumof(5, 0);
    }
}  

