package com.asiet.nestediface;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NestedIfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect = new Rectangle();
		NestedIfaceClass.Shape sh = rect;
		sh.printSides();
		
	}

}
