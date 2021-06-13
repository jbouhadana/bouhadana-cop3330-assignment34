/*
 *  UCF COP3330 Summer 2021 Assignment 34 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        String[] employeeNames = {"John Smith","Jackie Jackson","Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
        int length = employeeNames.length;
        System.out.println("There are " + length + " employees:");
        for(int i = 0; i < employeeNames.length;i++)
        {
            System.out.println(employeeNames[i]);
        }
        System.out.println("Enter an employee name to remove:");
        String removal = jb.nextLine();
        for (int i = 0; i < employeeNames.length; i++)
        {
            if (employeeNames[i].equals(removal))
            {
                employeeNames[i] = null;
                length--;
                break;
            }
        }
        System.out.println("There are " + length + " employees:");
        for(int i = 0; i < employeeNames.length;i++)
        {
            if(employeeNames[i] == null)
            {
                continue;
            }
            else {
                System.out.println(employeeNames[i]);
            }
        }
    }
}
