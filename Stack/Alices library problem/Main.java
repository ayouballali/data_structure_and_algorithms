package org;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String s = "/u/love/hi\\i\\ho\\" ;loveihi  ihievolho
        Stack<String> stack = new Stack<>();
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '/'){
                stack.push(temp);
                temp = "";
            } else if (s.charAt(i) == '\\') {
                String rev = new  StringBuilder(temp).reverse().toString();
                if(stack.empty()){
                    temp = rev ;
                }else {
                    temp = stack.pop() + rev ;
                }
            }
            else {
                temp+=s.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
//
//import java.util.Stack;
//
//class Main {
//    public static void main(String args[] ) throws Exception {
//        //BufferedReader
//      String name = "/u/love\\i\\" ;        // Reading input from STDIN
//        System.out.println(reRange(name));    // Writing output to STDOUT
//    }
//
//    public static String reRange(String s ){
//        Stack<String> stack = new Stack<>(); // stack to store shelf arrangements
//        String x = ""; // current shelf arrangement
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '/') {
//                // start new shelf arrangement
//                stack.push(x);
//                x = "";
//            } else if (s.charAt(i) == '\\') {
//                // reverse current shelf arrangement and append to previous shelf arrangement
//                String rev = new StringBuilder(x).reverse().toString();
//                String temp = "";
//                if (!stack.empty()) {
//                    temp = stack.pop() + rev;
//                } else {
//                    temp = rev;
//                }
//                x = temp;
//            } else {
//                // add book to current shelf arrangement
//                x += s.charAt(i);
//            }
//        }
//        // reverse final arrangement of books and print
//        String finalArrangement = new StringBuilder(x).reverse().toString();
//        finalArrangement = new StringBuilder(finalArrangement).reverse().toString();
//        // System.out.println(finalArrangement);
//        return finalArrangement ;
//    }
//}
