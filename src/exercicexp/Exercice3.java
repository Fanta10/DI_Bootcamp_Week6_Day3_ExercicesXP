package exercicexp;


import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entrer un nombre : ");
		Scanner sc = new Scanner(System.in);
		int nombre = sc.nextInt();

		String nombreString = String.valueOf(nombre);
		String nombreReverse = "";

		for (int i = nombreString.length() - 1; i >= 0; i--) {
			nombreReverse += nombreString.charAt(i);
		}

		System.out.println( " l'inverse du nombre saisi est : " + nombreReverse);

	}

}
