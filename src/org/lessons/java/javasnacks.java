package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class javasnacks {
	public static void main(String[] args) {
//		Snack1
//		Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("inserisci un numero: ");
//		int nEvenOrOdd = sc.nextInt();
//		
//		if(nEvenOrOdd % 2 == 0) {
//			System.out.println(nEvenOrOdd);
//		} else{
//			System.out.println(nEvenOrOdd + 1);
//		}
		
//		Snack2
//		Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
		Random rnd = new Random();
		String[] names = {"Luca", "Marco", "Francesca", "Giada", "Mario", "Monica", "Marta", "Andrea"};
		String[] surnames = {"Rossi", "Bianchi", "Marroni", "Cosentini", "De Marco", "Verratti", "Di Lorenzo", "Raspadori"};
		
		for(int i = 0; i < names.length; i++) {
			String randomNames = names[rnd.nextInt(0, names.length)];
			String randomSurnames = surnames[rnd.nextInt(0, surnames.length)];
			
			System.out.println(randomNames + " " + randomSurnames);
		}

//		Snack3
//		Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari
		int[] sumOdd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sumArray = 0;
		for(int i = 1; i < sumOdd.length; i += 2) {
			sumArray += sumOdd[i];
		}
		System.out.println(sumArray);

//		Snack4
//		Data in input una stringa verificare se è palindroma
		System.out.println("scrivi una parola: ");
		
		String palindroma = sc.nextLine();
		char[] isPalindroma = palindroma.toCharArray();
		String checkWord = "";
		
		for (int i = isPalindroma.length; i > 0; i--) {

			checkWord += isPalindroma[i - 1];
		}

		if (palindroma.equals(checkWord)) {
			System.out.println("è palindroma");
		} else {
			System.out.println("NON è palindroma");
		}		
//		Snack5
//		Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//		Continuare a chiedere una nuova stringa finchè non si inserisce 0.

//		Bonus
//		Snack 6
//		Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//		Possibile usare solo :
//		cicli
//		chartAt
//		if / switch
//		Es. “25” come stringa deve essere convertito in intero 25.

//		Snack 7
//		Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
		
		sc.close();
	}
}
