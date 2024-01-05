package javaprogram;

import java.util.Scanner;
class Subject{
	int max=100;
	int obtd;
}
public class Percentage {
	public static void main(String[] args) {
        Subject s1=new Subject();
        System.out.print("Enter Science Marks : ");
        Scanner sc = new Scanner(System.in);
        s1.obtd = sc.nextInt();
        Subject s2=new Subject();
        System.out.print("Enter Math Marks : ");
        s2.obtd = sc.nextInt();
        Subject s3=new Subject();
        System.out.print("Enter English Marks : ");
        s3.obtd = sc.nextInt();
        Subject s4=new Subject();
        System.out.print("Enter Social Science Marks : ");
        s4.obtd = sc.nextInt();
        Subject s5=new Subject();
        System.out.print("Enter Hindi Marks : ");
        s5.obtd = sc.nextInt();
        int totobtd=(s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        int Avg=(totobtd*100/500);
        System.out.print("Percentages Obtained : "+Avg);
	} 
}