package javaprogram;
import java.util.Scanner;
public class CountCapletter {
	 public static void main(String args[])
	    {
	        String str = "Hello Rider";
	        int capital=0;
	 
	        for(int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	                capital++;
	         
	        }
	 
	        System.out.println("Capital case letters : " + capital);
	    }
	}
