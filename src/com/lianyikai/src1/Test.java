package com.lianyikai.src1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("=====欢迎来到商品管理系统=======");
		System.out.println("情输入你进行的操作：1。添加商品，2。删除商品，3。修改商品");
		Scanner scanner=new Scanner(System.in);
		int s = scanner.nextInt();
		Menu menu = new Menu(s);
	
		

	}

}
