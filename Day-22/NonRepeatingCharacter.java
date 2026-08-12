import java.util.Stack;

public class NonRepeatingCharacter {
   public static void main(String[] args){
    Stack<Character> string=new Stack<>();
    String input="abbaca";
    for(int i=0;i<input.length();i++){
        char cake=input.charAt(i);
        if(!string.isEmpty() && string.peek()==cake){
            string.pop();
        }
        else{
            string.push(cake);
        }
        
    }
    System.out.println(string);
}
}