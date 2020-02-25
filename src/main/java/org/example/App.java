package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    Student s = new Student(13, "Brandon");
    Student r = new Student(13, "Brandon");
    Student x = new Student(15, "Molly");

    public int addition(int a, int b) {
        return a+b;
    }

    public double multiply(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        return a/b;
    }



    public static void main( String[] args ) {
        System.out.println( "Hello World!" );



    }
}
