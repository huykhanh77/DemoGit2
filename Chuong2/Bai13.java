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
public class Bai13 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("nhap gia ban: ");
		double giaBan = sc.nextDouble();	
		System.out.println("nhap phan tram giam gia: ");
		int giamGia = sc.nextInt();
		//result
		double result = giaBan - giaBan * giamGia / 100;
		//display
		System.out.println(result);
	} 
}
