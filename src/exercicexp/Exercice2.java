package exercicexp;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String nombre = "";
        
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= i; j++) {
                nombre += String.valueOf(i);
                
            }
            System.out.println(nombre);
            nombre = "";
        }

	}

}
