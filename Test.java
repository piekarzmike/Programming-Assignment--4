/*
**********************************************************************************************
	Author: Mike Piekarz

	Date: 8/26/2020
	
	Course Name: Programming Fundamentals	
	
	Semester: 2020 Summer

	Assignment Name: Programming Assignment 4 – Set ADT
**********************************************************************************************
*/

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Create program header details (Program Name, Programmer Name, Program Assignment #, & Welcome Intro) and display to the user
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Mike Piekarz");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - Set");

		// Declare and Initialize variables
		Scanner scan = new Scanner(System.in);
		String userInput = "test";
		Set linkedList = new Set();

		// Based upon users input call the various methods to create/modify the list
		while (userInput != null) {

			System.out.print("\nEnter command: ");
			userInput = scan.nextLine();
			userInput = userInput.toLowerCase();

			if (userInput.contains("add")) {
				linkedList.add(userInput, linkedList);
			}
			else if (userInput.contains("del")) {
				linkedList.del(userInput, linkedList);
			}
			else if (userInput.contains("exists")) {
				linkedList.exists(userInput, linkedList);
			}
			else {

			}
		}

	}
}
