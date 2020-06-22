package com.lianyikai.src2;

import java.util.HashMap;
import java.util.Map;

import com.lianyikai.src2.ProductBean;

public class ProductManager {
	
	Map<Integer,ProductBean> productMap = new HashMap<Integer,ProductBean>();
	ProductBean productBean=new ProductBean();
	Integer d= new Integer(1);
	void init(){	
	    	productMap.put(d,new ProductBean(1,"衣服",10.00));
	    	productMap.put(d+1,new ProductBean(2,"枯枝",11.00));
	    	productMap.put(d+2,new ProductBean(3,"不知道",12.00));
	    	productMap.put(d+3,new ProductBean(4,"家",13.00));
	    	productMap.put(d+4,new ProductBean(5,"uu",14.00));
	    	}
	
	
	
	void add(ProductBean product){
		productMap.put(product.getId(),product);
		System.out.println(productMap.toString());
	}
	
	
	void delect(int id){
		if(productMap.containsKey(id))
		productMap.remove(id);	
	}
	
	void update(int id){
		
	}
	
	public void searchById(int id){
		if(productMap.containsKey(id))
			System.out.println(productMap.get(id).toString());	
		  else
		    	System.out.println("没有这个值对应的key");	
	}
	  
	public void SearchByName(String name){
		for(Map.Entry<Integer,ProductBean> entry : productMap.entrySet()){
			System.out.print("Key = "+entry.getKey()+",value="+entry.getValue());
			if(!productMap.isEmpty()&&entry.getValue().toString().contains(name)) {
				System.out.println(productBean.toString());
			}
		}
		
	}
	

}
