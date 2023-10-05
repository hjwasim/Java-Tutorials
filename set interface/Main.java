package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		//Both HashSet and LinkedHashSet have same methods.
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		//In case of LinkedHashSet, The order is mainted.
		// HashTable + LinkedList used
		linkedHashSet.add(4);
		linkedHashSet.add(8);
		linkedHashSet.add(12);
		linkedHashSet.add(7);
		
		System.out.println(linkedHashSet); // [4, 8, 12, 7] same as we added into the map
		
		Set<Integer> normalHashSet = new HashSet<>();
		//In HashSet, The order is not maintained.
		// usual HashTable concept used
		normalHashSet.add(4);
		normalHashSet.add(8);
		normalHashSet.add(12);
		normalHashSet.add(7);
		
		System.out.println(normalHashSet); // [4, 7, 8, 12] order got changed
	}
}
