package N1E2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;	

public class Main {
	public static void main (String args[]) {
		List<Integer> llista1 = new ArrayList<Integer>();
		List<Integer> llista2 = new ArrayList<Integer>();
		
		llista1.add(1);
		llista1.add(2);
		llista1.add(3);
		
		llista2.add(1);
		llista2.add(2);
		llista2.add(3);
		
		System.out.println(llista2);
		
		ListIterator<Integer> it = llista1.listIterator(llista1.size());
		
		while(it.hasPrevious()) {
			llista2.add(it.previous());
		}
		
		System.out.println(llista2);
		
	}
	
	
	
	
}
