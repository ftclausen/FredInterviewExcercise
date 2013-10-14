package com.blackboard;

public class App {

	public static void main(String[] args) {
		drawMyLine(new HorizontalLine());
	}
	
	public static void drawMyLine(Line l) {
		l.setLength(10);
		l.split(1);
		System.out.println(l.toString());
	}

	
}
