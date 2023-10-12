/*Problem Statement:Implement Fraction Class with the following properties and functions.
Properties:
1.Numerator
2.Denominator
Functions:
1. Parametrized Constructor - Sets the numerator and denominator values.
2. Add - This function adds the two fraction following the adding up of two fraction rules and updates the first fractional number.
e.g.
if f1 = 1/4 and f2 = 3/5
f1.add(f2) ; results in:
f1 = 17/20 and f2 = 3/5
3.Multiply - This function multiplies the two fraction and updates the first fractional number.
e.g.
if f1 = 1/4 and f2 = 3/5
f1. multiply (f2) ; results in:
f1 = 3/20 and f2 = 3/5
4.Simplify - This function simplifies the fractional value. Use inbuilt__gcd() function.
e.g.
if f1 = 5/20 , which can be further simplified as 1/4 so this simplify will perform this.
5. Print() - Prints the final answer in numerator/denominator form.
Input Constraints:
1 <= numerator <= 100
1 <= denominator <= 100
1 <= N <= 15
type = 1 or 2
Sample Input 1:
67 14
1
2 7 78
Sample Output 1:
67/156
Sample Input 2:
47 71
3
1 91 78
2 67 75
1 36 74
Sample Output 2:
779/426
52193/3195 * theta
2506241/118215 * theta
*/
import java.util.* ; 
import java.io.*;

class Fraction {    
	int num;    
	int denom;        
	public Fraction(int num, int denom){        
		this.num = num;        
		this.denom = denom;    
	}        
	public void Add(Fraction F){        
		int cdenom = this.denom;        
		int num1 = this.num;        
		int num2 = F.num;        
		if(this.denom != F.denom){            
			cdenom = this.denom * F.denom;            
			num1 = num1 * F.denom;            
			num2 = num2 * this.denom;
        }        
		this.num = num1 + num2;        
		this.denom = cdenom;        
		this.simplify();        
		this.print();    
	}        
	public void multiply(Fraction F){        
		this.num = this.num * F.num;        
		this.denom = this.denom * F.denom;        
		this.simplify();        
		this.print();    
		}        
		static int gcd(int a, int b)    
		{        
			int i = b;        
			if (a < b)            
				i = a;        
			else            
				i = b;        
			for (i = i; i > 1; i--) {            
				if (a % i == 0 && b % i == 0)                
					return i;        
				}        
			return 1;    
			}        
			public void simplify(){        
				int gcd = gcd(num, denom);        
				num /= gcd;        
				denom /= gcd;    
				}        
				public void print(){        
					System.out.println(num + "/" + denom);    
				} 
	}

class Solution {

	public static void main(String args[]) {        
		Scanner sc = new Scanner(System.in);        
		int num = sc.nextInt();        
		int denom = sc.nextInt();                
		Fraction F1 = new Fraction(num, denom);                
		int n = sc.nextInt();                
		for(int i = 0; i < n; i++){            
			int ch = sc.nextInt();            
			int num2 = sc.nextInt();            
			int denom2 = sc.nextInt();            
			Fraction F2 = new Fraction(num2, denom2);            
			switch(ch){                
				case 1 : F1.Add(F2);                    
				break;                
				case 2: F1.multiply(F2);                    
				break;            
				}        
			}
		 }
	 }
