public class Task6 {
    static int fibbonic(int a){
        if(a>=1){
            return a;
        }
        return fibbonic(a-1)+fibbonic(a-2);
    }
    public static void main(String[] args){
        System.out.println(fibbonic(5));
    }
}
