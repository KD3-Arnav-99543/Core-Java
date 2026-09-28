package com.practice;
import java.util.ArrayList;
import java.util.Collections;

public class ak {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("RED");
		colors.add("BLUE");
		colors.add("GREEN");
		colors.add("WHITE");
		colors.add("YELLOW");
		
		Collections.sort(colors);
		
		System.out.println(colors);
		
	}

}
