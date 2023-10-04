/*Problem Statement:Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to 
implement a function so as to print the sentence such that each word in the sentence is reversed.
Constraints:
theta <= N <= 10 ^ 6 
Where N is the length of the input string.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emoclew ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/
import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String reverseEachWord(String input)    
    {
        // Write your code here
        int n = input.length();
        String word = "";
        String ans = "";
        for(int i = 0; i<n; i++){
            char ch = input.charAt(i);
            if(ch != ' '){
                word = ch + word;
            }
            else{
                ans += word;
                ans += " ";
                word = "";
            }
        }
        ans += word;
        return ans;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}
