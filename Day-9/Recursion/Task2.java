public class Task2 {
    static void Saravana(int n){
        if(n==0) return;
        System.out.print(n + " ");
        Saravana(n-1);
    }
    public static void main(String[] args) {
        Saravana(5);
    }
}
