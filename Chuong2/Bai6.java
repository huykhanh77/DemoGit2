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
public class Bai6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//input
		System.out.println("nhap so nguyen thu nhat: ");
		int num1 = sc.nextInt();
		System.out.println("nhap so nguyen thu hai: ");
		int num2 = sc.nextInt();
		// tong
		int sum = num1 + num2;
		// hieu
		int effect = num1 - num2;
		// tich
		int product = num1 * num2;
		// thuong
		double quotient = num1*1.0 / num2;
		
		//in ra ket qua
		System.out.println("Tong 2 so la: " + sum);
		System.out.println("Hieu 2 so la: " + effect);
		System.out.println("Tich 2 so la: " + product);
		System.out.println("Thuong 2 so la: " + quotient);
		
	} 
}
