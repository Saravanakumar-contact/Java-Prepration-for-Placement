public class largest {
    public static void check(int a ,int b ,int c){
        if(a > b && a > c){
            System.out.println(a + " Is grater");
        }
        else if(b >a && b > c){
            System.out.println(b + "Is greater");
        }
        else{
            System.out.println(c +" is Greater");
        }
        }

        public static void main(String[] args) {
            check(10, 2, 4);
        }
    }

