package dauphine;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;


public class Panel {

	public Panel() {
		// TODO Auto-generated constructor stub
	}
	
	private static Iterator<Integer> panel1(int i, int j) {

		Iterator<Integer> it = new Iterator<Integer>() {

			private int debut = i;
			private int fin = j;
					
			/*
			 * HasNext() affiche true si il y a encore des elements 
			 * et false si il n'y a plus d'éléments 
			 */
			@Override
			public boolean hasNext() {
                return debut <= fin;
			}
			
			/*
			 * Next() affiche l'elements suivant s'il existe 
			 */
			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				if (hasNext() == false) {
					//throw new Exception();
					System.out.println("Plus d'éléments");
				}
				return Integer.valueOf(debut++);
			}
		};
		return it;
	}
	
	public static Iterable<Integer> panel2(int i, int j) {
		// TODO Auto-generated method stub
		
		Iterable<Integer> it = new Iterable<Integer>() {
			
			@Override
			public Iterator<Integer> iterator() {
				return panel1(i, j);
			}
		};
		
		return it;
	}
	
	//Implémentation des méthodes get() et size()
	
	public static List<Integer> panel(int i, int j){
		
		List<Integer> it = new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return i + index ;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return (i-j)+1;
			}
			
			@Override
			public Iterator<Integer> iterator() {
				return panel1(i, j);
			}
			
		};

		return it;
		
	}
	


	public static void main(String[] args) {
	
		System.out.println("Panel 1"); 
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
		   System.out.println(it.next()); // affiche 1 2 3 4 5
		
		System.out.println("\nPanel 2"); 
		for(int i:panel2(1,5))
			System.out.println(i); // affiche 1 2 3 4 5
		
		System.out.println("\nPanel 3"); 
		List<Integer> l = panel(3,6);
		for (int i:l) {
			System.out.println(i); // affiche 3 4 5 6 
		}
		System.out.println(l.get(1)); //affiche 4
	}

	

	
}
