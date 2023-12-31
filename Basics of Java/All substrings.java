/*Problem Statemet:For a given input string (str), write a function to print all the possible substrings.
Constraints:
theta <= N <= 10 ^ 3 
Where N is the length of the input string.
Sample Input 1:
abc
Sample Output 1:
a
ab
abc
b
bc
c
Sample Input 2:
co
Sample Output 2:
c
co
o
*/
import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static void printSubstrings(String input) {
        // Write your code here
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<input.length()+1;j++){
                System.out.println(input.substring(i,j));
            }
        }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}

