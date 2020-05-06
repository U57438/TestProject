package practiseproject;

import java.util.Scanner;

public class Pallendrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.next();
		String s1="";
		for(int i=s.length()-1;i>0;i--)
		{
			char c=s.charAt(i);
			 s1=s1+c;
					
		}
		System.out.println(s1);
		if(s1.equalsIgnoreCase(s))
		{
			System.out.println("pallendrome");
		}
		else
		{
			System.out.println("not pallendrome");
		}
		
			}

}
