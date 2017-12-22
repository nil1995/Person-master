package main.java.ru.sbt.mipt.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void  createPersonTest () {
        Person Mary = new Person(false, "Mary");
        assertEquals(Mary.sayName(), "Mary");
        Person John = new Person(true, "John");
        assertEquals(John.sayName(), "John");
    }

    @Test
    public void marryMaryJohn() throws Exception {
        Person Mary = new Person(false, "Mary");
        Person John = new Person(true, "John");
        assertTrue(John.marry(Mary));
    }

    @Test
    public void divorceMaryJohn() throws Exception {
        Person Mary = new Person(false, "Mary");
        Person John = new Person(true, "John");
        John.marry(Mary);
        assertTrue(John.divorce());
    }

    @Test
    public void marryMaryJane() throws Exception {
        Person Mary = new Person(false, "Mary");
        Person Jane = new Person(false, "Jane");
        assertFalse(Jane.marry(Mary));
    }

    @Test
    public void marryTwoPairse() throws Exception {
        Person Mary = new Person(false, "Mary");
        Person Jane = new Person(false, "Jane");
        Person John = new Person(true, "John");
        Person Peter = new Person(true, "Peter");
        assertTrue(Peter.marry(Mary));
        assertTrue(John.marry(Jane));
        assertTrue(John.marry(Mary));
        System.out.println(John.areYouMarried());
        System.out.println(Peter.areYouMarried());
    }

}