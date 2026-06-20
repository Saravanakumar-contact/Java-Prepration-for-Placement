public class count {
    public static void countcheck(int a){
        int count=0;
        while(a!=0){  
            a/=10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        countcheck(121);
    }
}
