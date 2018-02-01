package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample01 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("USA");
		al.add("UK");
		al.sort(null);
		al.add("JAPAN");
		al.add("ITALY");
		al.add("FRANCE");

		String place = al.get(2);
		System.out.println(place);

		int listCount = al.size();
		System.out.println(listCount);

		al.remove(2);
		place = al.get(2);
		System.out.println(place);

		// For each
		System.out.println("Start loop");
		for (String place2 : al){
			System.out.println(place2);
		}

		// Iterator
		System.out.println("Iterator");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String place3 = it.next();
			System.out.println(place3);
		}

	}

}
