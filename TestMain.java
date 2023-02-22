/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.project.testmain;

/**
 *
 * @author abdul
 */
//Abdulkarim Abdullah
//443005947
import java.util.Scanner;
public class TestMain {

    public static void main(String[] args) {
MangeMenu manageMenu= new MangeMenu();
int select;
Scanner input=new Scanner(System.in);
do {
	Menu();
        select= input.nextInt();
	switch (select) {
	case 1:
		manageMenu.input();
		break;
	case 2:
		manageMenu.print();
		manageMenu.DeleteFood();
		break;
	case 3:
                manageMenu.print();
		break;
					
	default:
		break;
				}
    } while (select !=0);
    }		
	
    static void Menu() {
System.out.println("-------MENU MANAGEFOOD----------");
System.out.println("0. Exit");
System.out.println("1. Add food");
System.out.println("2. Delete food");
System.out.println("3. print info table order");
System.out.println("---------------------------");
System.out.println("select");
    }
}

    
       
    
