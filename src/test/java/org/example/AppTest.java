package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    Student s = new Student(13, "Brandon");
    Student r = new Student(13, "Brandon");
    Student x = new Student(15, "Molly");
    Student c = s;

    @Test
    public void testObjectEqualityFail() {
        Assert.assertTrue(s == x);
    }


    @Test
    public void testObjectEqualitySuccess() {
        Assert.assertTrue(s != x && s == c);
    }

    @Test
    public void testObjectIdentityFail() {
        Assert.assertTrue(s.hashCode() == r.hashCode());
    }

    @Test
    public void testObjectIdentitySuccess() {
        Assert.assertTrue(s.hashCode() == c.hashCode());
    }

    @Test
    public void testPrint() {
        String print = "Hello world";
        Assert.assertTrue(print.equals("Hello world"));
    }

    @Test (timeout = 1000)
    public void testTimeoutSuccess() {
        Assert.assertTrue(s != x && s == c);
    }

    @Test (timeout = 1)
    public void testTimeoutFail() {
        while(true) {
            System.out.println("Test");
        }
    }

    @Ignore ("Not used")
    @Test
    public void testOut() {

    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
