package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Example {
	
	public static void main(String args[]) {
		
		LinkedList passengerList = new LinkedList();
		passengerList.add("Alex SMith");
		passengerList.add("VIP Person");
		passengerList.add("Mary Lou");
		passengerList.add("Sim Monk");
		
		ListIterator iterator = passengerList.listIterator();
		
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
	}

}
