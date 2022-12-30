import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class Parenthesis_Checker {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        Map <Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        boolean ispar = true ;
        if(x.length() %2 !=0) return false;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) == '(' || x.charAt(i) == '[' || x.charAt(i)=='{'){
                stack.push(x.charAt(i));
            }else{
               
                if( stack.isEmpty() || map.get(stack.peek())  != x.charAt(i)  ){
                    return  false;
                }else stack.pop();
            }
        }
        
        return stack.isEmpty() ;
    }
    public static void main(String[] args) {
        
    }
}

// link : https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&category[]=Stack&sortBy=submissions
