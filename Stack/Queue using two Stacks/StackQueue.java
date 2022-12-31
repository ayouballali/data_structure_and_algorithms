// link : https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1?page=1&category[]=Stack&sortBy=submissions

import java.util.Stack;
public class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        Stack<Integer> temp = s1;
         if(s1.isEmpty()) return -1;
	   // Your code here
	   while (!temp.isEmpty()){
	        s2.push(temp.pop());    
	   }
	  
	   int elm = s2.pop();
	   
	     while (!s2.isEmpty()){
	        s1.push(s2.pop());    
	   }
	   
	   return elm;
    }
}