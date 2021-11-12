
import java.util.Iterator;


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


	public static void main(String[] args) {
	
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
		   System.out.println(it.next()); // affiche 1 2 3 4 5
		
	}

	
}
