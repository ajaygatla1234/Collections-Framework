package EIL;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Practice {
	
	public static void main(String[] args) {
		
		//only used for List type of Collection Objects.
		//Its supports Bidirectional iteration
		//it can perform read & write operation.
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		
		ListIterator<Integer> li = al.listIterator();
		
		//forward direction
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li.add(4);   //adds the element at last
		
		System.out.println();
		//Backward direction
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		li.remove();  //removes first element
		
		System.out.println(al);
		
	}

}
