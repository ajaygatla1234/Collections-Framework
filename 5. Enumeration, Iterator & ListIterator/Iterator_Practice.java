package EIL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Iterator_Practice {

	public static void main(String[] args) {

		//Enumeration is only for Legacy Collections, but Iterator if for both Legacy & New Collections.(or all collection objects)
		//It can only perform forward iteration
		//Read-Only & special permission for removing.

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);

		Iterator<Integer> i = al.iterator();

//		i.hasNext();
//		i.next();
//		i.remove();

		//displaying
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		//Removing in Iteration
		while(i.hasNext()) {   //Checks whether the element is present in the collection or not, but it will not point to the element
//			i.remove();  we cannot directly remove the element because i is not pointing to the elements in the collection
			i.next();   //only after using next() it will point to first element & goes on, then we can remove
			i.remove();
		}//removes all the elements

		System.out.println(al);


		//if you want only first element to remove
		i.next();
		i.remove();
		System.out.println(al);


		//using HashMap
		//Since Map is not under the Collection interface, we cannot use the iterator() for Map sub classes
		HashMap<Integer, String> ht = new HashMap<Integer, String>();

		ht.put(1, "Banana");
		ht.put(2, "Cherry");
		ht.put(3, "Mango");
		ht.put(4, "Apple");
		
		
		
		Iterator<Integer> i1=ht.keySet().iterator();   //since keySet() is Set type, it will have iterator(), So we can use like this.
		Iterator<String> i2=ht.values().iterator();
		//we have to do it separately for keys & values
	}

}
