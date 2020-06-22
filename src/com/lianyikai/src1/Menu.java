package com.lianyikai.src1;

import java.util.Scanner;

public class Menu {
	ProductBean product =new ProductBean();
	ProductManager productManager=new ProductManager();
	
    public Menu(int d){
    	productManager.init();
    	Boolean flag=true;
    	while(flag){
    	
		switch(d){
			case 1:
			    Boolean flag2=true;
			    int id=1;
			 	while(flag2){
			 		product.setId(id);
			 		id++;
			 		System.out.println("情输入上商品名称(String)");
					Scanner s1=new Scanner(System.in);
					product.setName(s1.next());
					System.out.println("情输入上商品价格（double）");
					Scanner s2=new Scanner(System.in);
					product.setPrice(s2.nextDouble());
					productManager.add(product);
					System.out.println("是否继续输入1:继续，2退出");
					Scanner s3=new Scanner(System.in);
					if(s3.nextInt()!=1){
						flag2=false;
					}
					
				}			
				break;
				
			case 2:
				System.out.println("请输入你要删除商品的id");
				Scanner s4=new Scanner(System.in);
				productManager.delect(s4.nextInt());
				break;
			case 3:
				System.out.println("请输入你要更新的商品id：");
				Scanner s5=new Scanner(System.in);
				productManager.update(s5.nextInt());
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
		
    	System.out.println("是否要继续使用系统？1：继续，2：退出");
    	Scanner s8=new Scanner(System.in);
    	if(s8.nextInt()!=1)
    		{flag=false;
    		System.out.print("退出系统成功");
    		}
    	
    	}
    }
	
    

}
