package exercicexp;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<500; i++) {
            String nombre = String.valueOf(i);
            
            if(nombre.length() > 1) {
                int somme = 0;
                for(int j = 0; j<nombre.length(); j++) {
                    int Char = Integer.parseInt(String.valueOf(nombre.charAt(j)));
                    somme += Math.pow(Char, 3);
                }
                
                if(somme == Integer.parseInt(nombre)) {
                    System.out.println(nombre + " est un nombre d'Armstrong");
                }
            }
        }

	}

}
