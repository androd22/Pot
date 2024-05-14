package utilitaires;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import model.Aliment;
import potager.Potager;
import java.util.Map;
import java.util.Scanner;

public class Utilitaires {

	public static int readInt() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		try{
			i = sc.nextInt();
		}
		catch(Exception e) {
		}
		return i;
	}

	public static String saisieString(){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	public static void printHashMap(HashMap<Aliment, Integer> gardeManger) {

	}

	public static String lowerCaseLetter(String inputString) {

		char firstLetter = inputString.charAt(0);
		char lowerFirstLetter = Character.toLowerCase(firstLetter);
		return inputString.replace(inputString.charAt(0), lowerFirstLetter);
	}

	//le truc qui print le potager doit indiquer par une lettre minuscule
	//ce qui n'est pas mûr, et par une majuscule ce qui est prêt à être recolté
	//donc, pas ce qui est en dessous!
	public static void printPotager(ArrayList<Aliment> potager) {
		for (Aliment aliment : potager) {
			if(aliment.getRecoltePousse()>=aliment.getNiveauDeMaturite()){
				System.out.println(aliment);
			}else{
				aliment.setNom(lowerCaseLetter(aliment.getNom()));
				System.out.println(aliment);

			}
		}
	}


}
