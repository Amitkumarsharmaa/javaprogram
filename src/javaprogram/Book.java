package javaprogram;
import java.util.Scanner;

public class Book
{
    String bookTitle;
    int numPages;

    void setBTitle(String title)
    {
        bookTitle = title;
    }

    void setBPages(int pages)
    {
        numPages = pages;
    }

    private String getBTitle()
    {
        return bookTitle;
    }

    private int getBPages()
    {
        return numPages;
    }

    public void displayBookInfo()
    {
        System.out.println("The book's title is: " + bookTitle + ".");
        System.out.println("The number of pages is: " + numPages + ".");
    }
}
class Textbook extends Book
{
    int gradeLevel;

    public int getGLevel()
    {
        return gradeLevel;
    }

    public void setGLevel(int level)
    {
        gradeLevel = level;
    }
    }
class DemoBook
{
    public static void main(String[] args)
    {
        String BTitle;
        int BPages;
        int BLevel;

        Book b = new Book();
        Textbook t = new Textbook();
        Book bt = new Textbook();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the title of your book: ");
        BTitle = input.nextLine();
        System.out.println("Please enter the number of pages: ");
        BPages = input.nextInt();
        System.out.println("Please enter the grade level: ");
        BLevel = input.nextInt();

        b.setBTitle(BTitle);
        b.setBPages(BPages);
        t.setGLevel(BLevel);

        b.displayBookInfo();

    }
}