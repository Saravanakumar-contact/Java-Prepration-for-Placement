public class count {
    static int countf(int a){
        if(a==0) return 0;
        return 1+countf(a/10);
    }
    public static void main(String[] args) {
        System.out.println(countf(123));
    }
}
