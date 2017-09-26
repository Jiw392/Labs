/* Jinke Wang
 * Section: Tuesday lab
 */

package demo;

import java.util.Scanner;

public class Lab5Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Type a word that you are going to test");
		String A = console.nextLine();
	while(!A.equals("")){
		if (isaPalindrome(A)){
		System.out.print(A+" is a Palindrome");
		}
		else
		System.out.print(A+" is not a Palindrome");
		System.out.println(" Type a new word to test that");
		A = console.nextLine();
	}}
	
	public static boolean isaPalindrome(String expr)  {
		if(expr.length()==0||expr.length()==1)
		{
			return true ;  
		}
		if(expr.charAt(0)==' ') 
		{
			return isaPalindrome(expr.substring(1, expr.length()));
		}
		if(expr.length()-1==' ') {
			return isaPalindrome(expr.substring(0,expr.length()-1));
		}
		if(expr.charAt(0)==expr.charAt(expr.length()-1)) {
			return isaPalindrome(expr.substring(1, expr.length()-1));
		}
			return false;
	}}
		


