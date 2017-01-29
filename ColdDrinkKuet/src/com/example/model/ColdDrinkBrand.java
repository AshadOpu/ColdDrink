package com.example.model;
import java.util.*;
public class ColdDrinkBrand {

public List getBrands(String color){
	
	List l1=new ArrayList();
	if(color.equals("black")){
		l1.add("pepsi");
		l1.add("coca cola");             
	}
	
	else if(color.equals("yellow")){
		l1.add("pepsi");
		l1.add("coca cola");
	}
	else if(color.equals("light")){
		l1.add("pepsi");
		l1.add("coca cola");
	}	
	return l1;
}















}
