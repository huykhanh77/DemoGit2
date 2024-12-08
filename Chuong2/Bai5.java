/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai5 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("Nhap so nguyen:");
		int numberInt = sc.nextInt();
		//input
		System.out.println("Nhap so thuc:");
		float numberFloat = sc.nextFloat();
		//input
		System.out.println("Nhap 1 ki tu");
		char character = sc.next().charAt(0);
		sc.nextLine();
		//input
		System.out.println("Nhap 1 chuoi ki tu:");
		String str = sc.nextLine();
		//in ra screen
		System.out.println(numberInt);
		System.out.println(numberFloat);
		System.out.println(character);
		System.out.println(str);
	}
}
