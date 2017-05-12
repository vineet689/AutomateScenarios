package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCollection9 {
	public static void main(String[] args){
		//Creating HashSet and adding elemenets
		Set<String> set1= new HashSet<String>();
		set1.add("Ravi");
		set1.add("Vijay");
		set1.add("Vineet");
		set1.add("Ravi");
		set1.add("Ravi");
		set1.add("Vijay");
		set1.add("Vineet");
		set1.add("Ravi");
		//Travsersing elemenets
		Iterator<String> itr = set1.iterator();
		
		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}
	}

}
