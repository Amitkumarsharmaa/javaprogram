package javaprogram;
import java.util.Scanner;
public class Kmtomiles {
public static void main(String[]args) {
	double km,miles;
	double conftr=1.609344;
	System.out.print("Enter Distance value in km : ");
    Scanner sc = new Scanner(System.in);
    km = sc.nextDouble();
    miles=km/conftr;
    System.out.print("Distance in Miles :"+miles);
}
}
