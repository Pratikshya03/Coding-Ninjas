/*
Problem Statement:Ninja is shifting to a new place named NinjaGram. To take admission to the new school, the teacher gives him a sentence and asks him to check whether the sentence is a pangram.

A word or a sentence is called a pangram if it contains all

the English alphabet letters. Since Ninja is new to programming, he doesn't have much experience; he asks you to solve the problem. Can you help Ninja figure out whether the sentence is a pangram?

Detailed explanation (Input/output format, Notes, Images) Input Format:

The first line of input contains an integer 'T' denoting the number of test cases. The test cases follow.

The first line of each test case contains a number 'n' denoting the number of characters in the string.

The second line of each test case contains the string where the string characters can be both uppercase and lowercase.

Output Format:
For each test case, if Ninja managed to solve the problem, print "YES" else "NO".

Print the output of each test case in a separate line.

Note:

You are not required to print the expected output; it has already been taken care of. Just implement the function.
Constraints:

1<= T <= 50

1<= n <= 10^4

Where 'T' is the number of test cases, 'n' denotes the number of characters in the string.
Sample Input 1:

2

12

toosmallword

35

TheQuickBrown Fox JumpsOverTheLazyDog

Sample Output 1:

NO

YES
Sample Input 2:

2

16

CodingNinjas

10

CodeStudio

Sample Output 2:

NO

NO


*/
import java.util.* ;
import java.io.*; 
public class Solution { 
public static boolean ninjaGram(String str) {
HashMap<Character,Integer> hm=new HashMap<>();
       if(str.length()<26)
          return false;
       else{
          for(int i=0;i<str.length();i++){
              hm.put(Character.toLowerCase(str.charAt(i)),hm.getOrDefault(str.charAt(i),0)+1);
          }
       }
return hm.size()==26?true:false;
   }
}
