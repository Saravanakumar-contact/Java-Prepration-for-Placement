public class sum {
    static int Sumof(int a){
        if(a==0) return 0;
        return a+Sumof(a-1);
    }
    public static void main(String[] args){
        System.out.println(Sumof(3));
    }
}
