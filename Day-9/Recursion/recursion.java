public class recursion {
    static void printsum(int n){
        if(n==0) return;
        System.out.println(n);
        printsum(n-1);   
    }
    public static void main(String[] args){
        printsum(5);
    } 
    
}
