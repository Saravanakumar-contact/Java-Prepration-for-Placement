import java.util.*;
public class reverseStack{
    public static void main(String[] args){
    
    Stack<Character> stack=new Stack<>();
     String input="hello";
     for(int i=0;i<input.length();i++){
       stack.push(input.charAt(i));
     }
     while(!stack.isEmpty()){
        System.out.print(stack.pop());
     }}


}