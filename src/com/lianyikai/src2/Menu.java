package com.lianyikai.src2;

import java.util.Scanner;

import com.lianyikai.src1.ProductBean;
import com.lianyikai.src1.ProductManager;

public class Menu {
	ProductBean product =new ProductBean();
	ProductManager productManager=new ProductManager();
	Scanner S;
	
	public Menu(int s) {
		// TODO Auto-generated constructor stub
		productManager.init();
		switch(s){
		case 1:
			Boolean flag2=true;
		 	while(flag2){
		 		System.out.println("请输入上商品id(int)");
		 		S=new Scanner(System.in);
		 		product.setId(S.nextInt());
		 		System.out.println("请输入上商品名称(String)");
				S=new Scanner(System.in);
				product.setName(S.next());
				System.out.println("请输入上商品价格（double）");
				S=new Scanner(System.in);
				product.setPrice(S.nextDouble());
				productManager.add(product);
				System.out.println("是否继续输入1:继续，2:退出");
				S=new Scanner(System.in);
				if(S.nextInt()!=1){
					flag2=false;
					//System.out.println();
					System.out.println("退出系统成功");
				}
				
			}			
			break;
		case 3:
			
			break;
		case 4:
			System.out.println("请输入你要查找的商品id：");
			Scanner s6=new Scanner(System.in);
			productManager.searchById(s6.nextInt());
			break;
		case 5:
			System.out.println("请输入你要查找的商品名称：");
			Scanner s7=new Scanner(System.in);
			productManager.searchByName(s7.next());
			break;
		
		}
		
		
	}

}
