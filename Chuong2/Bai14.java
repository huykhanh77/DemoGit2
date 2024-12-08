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
public class Bai14 {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("nhap so dien: ");
		int dien = sc.nextInt();
		//int gia tri ban dau cua tien
		double tien = 0;
		//analyze cac condition 
		if (dien > 0 && dien <= 50) {
			tien = dien * 1418;
		} else if (dien >= 51 && dien <= 100) {
			tien = 50 * 1418 + (dien - 50) * 1533;
		} else if (dien >= 101 && dien <= 200) {
			tien = 50 * 1418 + 50 * 1533 + (dien - 100) * 1786;
		} else if (dien >= 201) {
			tien = 50 * 1418 + 50 * 1533 + 100 * 1786 + (dien - 50 - 50 -100) * 2242;
		}
		//suy ra duoc so tien
		System.out.println("tien dien la: " + tien);
	} 
}
