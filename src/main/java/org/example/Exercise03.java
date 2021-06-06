package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class Exercise03
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String quote, who;
        System.out.print("What is the quote? ");
        quote = sc.nextLine();
        System.out.print("Who said it? ");
        who = sc.nextLine();
        System.out.print(who + " says, \"" + quote + "\"" );
    }
}
