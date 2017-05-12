package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {

	public static void main(String[] args) {
		HashSet <String> newset=new  HashSet<String>();
		
		//populate hash set
		newset.add("Learning");
		newset.add("Easy");
		newset.add("Simply");
		//Create an iterator
		Iterator iterator = newset.iterator();
		//check values
		while(iterator.hasNext()){
			System.out.println("Values: " +iterator.next() + " ");
		}
		
		

	}

}
