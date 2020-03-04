package com.linhcaro.hellojava.homework;

public class ToanHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		long y = 100;
		double k = 4.5;
		
		//Tong
		System.out.println("Tổng các số:");
		System.out.println("------------------------------------------------------");
		long tongxy = x + y;
		double tongxk = x + (double) k;
		double tongyk = y + (double) k;
		double tongxyk = x + y + (double) k;
		System.out.println("Tổng giữa "+x+" và "+y+" là: "+tongxy);
		System.out.println("Tổng giữa "+y+" và "+k+" là: "+tongyk);
		System.out.println("Tổng giữa "+x+" và "+k+" là: "+tongxk);
		System.out.println("Tổng giữa "+x+" và "+y+" và "+k+" là: "+tongxyk);
		System.out.println("------------------------------------------------------");
		
		//Hieu
		System.out.println("\nHiệu các số:");
		System.out.println("------------------------------------------------------");
		long hieuxy = y - x;
		double hieuxk = x - (double) k;
		double hieuyk = y - (double) k;
		double hieuxyk = y - x - (double) k;
		System.out.println("Hiệu giữa "+x+" và "+y+" là: "+hieuxy);
		System.out.println("Hiệu giữa "+y+" và "+k+" là: "+hieuyk);
		System.out.println("Hiệu giữa "+x+" và "+k+" là: "+hieuxk);
		System.out.println("Hiệu giữa "+x+" và "+y+" và "+k+" là: "+hieuxyk);
		System.out.println("------------------------------------------------------");
		
		//Tich
		System.out.println("\nTích các số:");
		System.out.println("------------------------------------------------------");
		long tichxy = y * x;
		long tichxk = x * (long) k;
		long tichyk = y * (long) k;
		long tichxyk = y * x * (long) k;
		System.out.println("Tích giữa "+x+" và "+y+" là: "+tichxy);
		System.out.println("Tích giữa "+y+" và "+k+" là: "+tichyk);
		System.out.println("Tích giữa "+x+" và "+k+" là: "+tichxk);
		System.out.println("Tích giữa "+x+" và "+y+" và "+k+" là: "+tichxyk);
		System.out.println("------------------------------------------------------");
		
		//Thuong
		System.out.println("\nThương các số:");
		System.out.println("------------------------------------------------------");
		long thuongyx = y / x;
		double thuongxy = (double) x / y;
		double thuongxk = x / (double) k;
		double thuongkx = (double) k / x;
		double thuongyk = y / (double) k;
		double thuongky = (double) k / y;
		double thuongxyk = (double) x / y / k;
		double thuongyxk = y / x / (double) k;
		double thuongkxy = (double) k / x / y;
		System.out.println("Thương giữa "+x+" và "+y+" là: "+thuongxy);
		System.out.println("Thương giữa "+y+" và "+x+" là: "+thuongyx);
		System.out.println("Thương giữa "+y+" và "+k+" là: "+thuongyk);
		System.out.println("Thương giữa "+k+" và "+y+" là: "+thuongky);
		System.out.println("Thương giữa "+x+" và "+k+" là: "+thuongxk);
		System.out.println("Thương giữa "+k+" và "+x+" là: "+thuongkx);
		System.out.println("Thương giữa "+x+" và "+y+" và "+k+" là: "+thuongxyk);
		System.out.println("Thương giữa "+y+" và "+x+" và "+k+" là: "+thuongyxk);
		System.out.println("Thương giữa "+k+" và "+x+" và "+y+" là: "+thuongkxy);
		System.out.println("------------------------------------------------------");
		System.out.println("-----------------Code--by--LinhCaro-------------------");
	}

}
