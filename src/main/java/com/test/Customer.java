package com.test;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
 
public class Customer 
{
	private Map maps;

	public Map getMaps() {
		return maps;
	}

	public void setMaps(Map maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "Customer [maps=" + maps + "]";
	}
	
	

public void display()
{
	Set keys = maps.keySet();
	Iterator	itr = keys.iterator();	
	while(itr.hasNext())
	{
		String key1= itr.next().toString();
		String value = maps.get(key1).toString();
		
		System.out.println(key1+":\t"+value);
	}
	
	
}
	
}