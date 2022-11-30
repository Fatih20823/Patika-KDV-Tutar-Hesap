package com.fatih.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ucret tutarini giriniz: ");
		int money = scan.nextInt();
		double kdv;
		
		if(money<=1000 && money>0) {kdv = 0.18;}
		else {kdv = 0.08;}
			
			double kdvliFiyat = (money*kdv)+money;	
			double kdvTutari = kdvliFiyat-money;
			
			System.out.println("KDV'siz fiyat: "+ money);
			System.out.println("KDV'li fiyat: "+kdvliFiyat);
			System.out.println("KDV tutari: "+kdvTutari);
		
			
		
	}

}
