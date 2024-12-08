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
public class Bai11 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("nhap ban kinh:");
		int bk = sc.nextInt();
		//calculate
		double dienTich = Math.PI * Math.pow(bk, 2);
		double chuVi = 2 * Math.PI * bk;
		//display
		System.out.println("dien tich la: "+dienTich);
		System.out.println("chu vi la: "+chuVi);
		
	}
}
