/**
 * 
 */
package com.example.model;

import java.util.*;

/**
 * @author lib
 *
 */
public class ColdDrinksBrands {
	public List getBrands(String color)
	{
		List L1 = new ArrayList<>();
		
		if(color.equals("black"))
		{
			L1.add("CocaCola");
			L1.add("Pepsi");
		}
		else if(color.equals("light"))
		{
			L1.add("Mountain Dew");
			L1.add("Sprite");
		}
		else if(color.equals("ORANGE"))
		{
			L1.add("Fanta");
			L1.add("Miranda");
		}
		else
		{
			L1.add("Mazaa");
			L1.add("Slice");
		}
		
		return L1;
	}

}
