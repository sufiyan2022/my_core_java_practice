package com.ras.ashokit.mystring;
/*
 *  Remove all white spaces from Given Stirng.
 *  Write a program to remove all white spaces from Given Stirng.
 *  
 *  Input: ja va st a r
 *  Output: javastar
 */

public class _9RemoveAllWhiteSpacefromString {
	public static void main(String[] args) {

		String str = "   ja v a  s ta  r  ";
		String str1 = str.replaceAll("\s", "");
		System.out.println(str1);
		
		
	}
}
