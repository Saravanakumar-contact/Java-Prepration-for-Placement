public class CheckPallindrome {
    public static void main(String[] args) {
        String s="madam";
        int right=s.length()-1;
        int left=0;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                break;
            }
             left++;
            right--;
        }
        
    }
}
