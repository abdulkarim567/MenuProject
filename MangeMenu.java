/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.testmain;

/**
 *
 * @author abdul
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MangeMenu {
    ArrayList<Food> foodlist = new ArrayList<>(); 
	Scanner input=new Scanner(System.in);
	
	public void input() {
	System.out.println("Enter number food add in menu");
	int n = input.nextInt();
	for (int i = 0; i < n; i++) {
		Food food = new Food(); 
		food.input(); 
		foodlist.add(food); 
	}
}
	public  void print() {
		for (int i = 0; i < foodlist.size(); i++) {
		System.out.println((i+1)+"."+foodlist.get(i).detail());
	}
}
        
	public void DeleteFood() {
	String deletefood;
	int c=0;
	System.out.println("Enter name food to delete");
	deletefood=input.nextLine();
	for (int i = 0; i < foodlist.size(); i++) {
		if (foodlist.get(i).getName().equals(deletefood)) {
			c++;
			foodlist.remove(i);
			System.out.println("delete finish");
			break;
		}
		}if (c==0) {
		System.out.println("no food name is "+deletefood);
		}
	}
}
