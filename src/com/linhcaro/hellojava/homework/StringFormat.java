package com.linhcaro.hellojava.homework;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 11;
		int tong = x + y;
		int hieu = y - x;
		int tich = x * y;
		double thuong = (double) y / x;
		String tongXY = "Tổng của "+x+" và "+y+" là: "+tong;
		String hieuXY = "Hiệu của "+x+" và "+y+" là: "+hieu;
		String tichXY = "Tích của "+x+" và "+y+" là: "+tich;
		String thuongXY = "Thương của "+x+" và "+y+" là: "+thuong;
		System.out.println("StringFormat:");
		System.out.println("------------------------------------------------------");
		System.out.println(tongXY);
		System.out.println(hieuXY);
		System.out.println(tichXY);
		System.out.println(thuongXY);
		System.out.println("------------------------------------------------------");
		System.out.println("-----------------Code--by--LinhCaro-------------------");
	}

}
