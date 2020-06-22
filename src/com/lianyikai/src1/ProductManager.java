package com.lianyikai.src1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
	ArrayList<ProductBean> productList =new ArrayList<ProductBean>();
	
    public void init(){	
    	productList.add(new ProductBean(7,"衣服",10.00));
        productList.add(new ProductBean(8,"裤子",170));
        productList.add(new ProductBean(9,"皮带",500));
        productList.add(new ProductBean(10,"米",150));
        productList.add(new ProductBean(11,"哈密瓜",100));}
	
	public void add(ProductBean product){
		productList.add(product);		
	}
	void delect(int id){
		for(ProductBean product:productList){
			if(!productList.isEmpty()&&product.getId()==id){
				productList.remove(id);	
			    System.out.print("删除成功！！！");
			}
				
			
			else
				System.out.print("你要删除的商品不存在");
		}

		
	}
	void update(int id){
		
		for(ProductBean product:productList){
			if(!productList.isEmpty()&&product.getId()==id)
				System.out.print("请输入你要修改后的商品名为：");
			    Scanner scanner1=new Scanner(System.in);
			    System.out.print("请输入你要修改的商品价格为：");
			    Scanner scanner2=new Scanner(System.in);
				productList.set(id,new ProductBean(id,scanner1.next(),scanner2.nextDouble()));	
			
		}

	}
	public void searchById(int id){
		for(ProductBean product:productList){
			if(!productList.isEmpty()&&product.getId()==id)
			{
				System.out.println("你查寻的商品为：");
				System.out.println(product.toString());
			}
			
		}

	}
	
	public void searchByName(String name){
		
		for(ProductBean product:productList){
			if(!productList.isEmpty()&&product.getName().contains(name))
			{
				System.out.println(product.toString());
			}
			else
				System.out.println("商品不存在！！"); 
		}
	}
	
}
