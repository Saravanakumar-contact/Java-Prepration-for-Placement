public class Task1 {
    static void Printvalue(int n){
        if (n==0) return;
        Printvalue(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Printvalue(5);
    }
}
