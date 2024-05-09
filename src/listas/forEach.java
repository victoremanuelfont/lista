package listas;

public class forEach {

	public static void main(String[] args) {
		
		
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for(int i=0; i<vect.length;i++) {
			
			System.out.println(vect[i]);
		}
		
		System.out.println("\n");
		
		// Laço for each
		//Para cada objeto "nomes" contido em "vect", faça: 
		for(String nomes: vect) {
			System.out.println(nomes);
		}
		
		
	}

}
