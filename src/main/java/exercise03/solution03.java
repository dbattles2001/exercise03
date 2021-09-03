package exercise03;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 Dustin Battles
 */

/*
 * In this one it's asking us for quotes so first
 * Lets make a string that'll ask the quote
 * A second string to ask who says it
 * and then a Systemout to put those things together :)
 */

public class solution03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quote, quoter;

        System.out.println("What quote would you like to share?");
        quote = input.next();
        System.out.println("And who was that quote by?");
        quoter = input.next();

        System.out.println("Like " + quoter + " always said; \"" + quote + ".\"");
    }
}
