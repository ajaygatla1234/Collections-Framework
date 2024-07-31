package EIL;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

public class Enumeration_Practice {

	public static void main(String[] args) {
		
		//Enumeration used for iterating Legacy Collections
		//It can only perform forward iteration
		//No Data Manipulations can be performed
		
		Vector<String> v = new Vector<String>();
		
		v.add("Banana");
		v.add("Cherry");
		v.add("Mango");
		v.add("Apple");
		
		Enumeration<String> e = v.elements();
		
		//methods present in Enumeration interface
//		e.hasMoreElements();
//		e.nextElement();
		
		System.out.println(e.hasMoreElements());
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		
		
		//Using HashTable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "Banana");
		ht.put(2, "Cherry");
		ht.put(3, "Mango");
		ht.put(4, "Apple");
		
		Enumeration<String> e1 =  ht.elements();   //Enumeration<String> we have to pass the values data-type, not the index.

		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
			
		}
		
		
		//using Properties
		Properties props = new Properties();
		props.setProperty("1", "Banana");
		props.setProperty("2", "Cherry");
		props.setProperty("3", "Mango");
		props.setProperty("4", "Apple");
		
		Enumeration<Object> e2=props.elements();
		
		while (e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
			
		}
		
		//we can also access iterator using enumeration
		Iterator<Object> obj = props.elements().asIterator(); //it supports only after Java 9
	}

}
