package com.test;

import java.util.Scanner;

import com.exp.Exceptiondemo;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a name: ");
			Exceptiondemo.show(sc.next());
		}
	}

}
