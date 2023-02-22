/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.testmain;

/**
 *
 * @author abdul
 */
import java.util.Scanner;

public class Food {
    public Food(){
        
    }
	public String Name;
	public double Price;
	public Food(String Name, double Price) {
		this.Name=Name;
		this.Price=Price;
	}
	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name food ");
		Name=input.nextLine();
		System.out.println("Enter Price food ");
		Price=input.nextFloat();
        }
        public String detail() {
		return Name+" "+Price;
	}
	public double getPrice(){
		return Price;
	}
	
	public String getName(){
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setPrice(double Price) {
		this.Price=Price;
	}
}