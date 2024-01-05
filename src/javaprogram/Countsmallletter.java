package javaprogram;
import java.util.Scanner;
public class Countsmallletter {
	    public static void main(String args[])
	    {
	        String str = "Hello Rider";
	        int small=0;
	 
	        for(int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z')
	                small++;
	         
	        }
	 
	        System.out.println("small case letters : " + small);
	    }
	}