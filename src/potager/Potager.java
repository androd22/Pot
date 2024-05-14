package potager;

import java.util.ArrayList;
import java.util.HashMap;

import data.TxtContent;
import model.*;
import utilitaires.Utilitaires;

public class Potager {

	//A la bonne place?
	HashMap<Aliment, Integer> gardeManger = new HashMap<Aliment, Integer>();
	ArrayList<Aliment> potager = new ArrayList<Aliment>();
	float argentDisponible = 10;
	boolean appliOn = true;
	public void cestparti() {

		System.out.println(TxtContent.TXTBONJOUR);

		/*System.out.println("Souhaitez vous restaurer une sauvegarde?");
		
		if(Utilitaires.readString().equals("oui")) {
			//TODO
			//Lecture d'un fichier txt contenant les informations normalisés du potager
			Utilitaires.restaurationData();
		}*/
		do {
			//a la bonne place???
			System.out.println(TxtContent.TXTCHOIXMENU);
			int i = Utilitaires.readInt();
			switch (i) {
				case 1: choixAliment();
					break;
				//TO DO
				//Gestion saisie utilisateur : ajout d'un des fruits/legumes saisie dans le potager
				//On plante une unité.
				case 2:
					Utilitaires.printPotager(potager);
					break;
				case 3:

					recolteAliment();

					//TO DO
					//On peut recolter l'un des fruits/legumes à maturité (ni trop tôt, ni trop tard)
					break;
				case 4:
					System.out.println("Vente au marché");
					//TO DO
					//Quel fruit/legume vendre ?
					break;

				case 5:
					System.out.println("Sauvegarde dans un fichier");
					//TO DO
					//On sauvegarde ce qui est dans le potager, ainsi que l'argent courant
					break;
				case 6: cestparti();
					break;
				default:
					;
			}
			pousseAliment();

			//TO DO
			//ajout : la pousse de chaque fruit/legume du potager
			//(il faut qu'à chaque action, tous les fruits et légumes poussent)
			//les fruits et légumes trop mûr sont perdus et retirés du potager

		}
		while (appliOn);
	}

	public void choixAliment(){

		System.out.println("Que voulez-vous planter?"
				+ " 1 Pdt, 2 Carotte, 3 Poireau, 4 Pomme");
		int j = Utilitaires.readInt();

		switch(j){
			case 1: potager.add(new Pdt());
			System.out.println(potager);
				break;
			case 2: potager.add(new Carotte());;
				break;
			case 3: potager.add(new Poireau());
				break;
			case 4: potager.add(new Pomme());
				break;
			case 5: cestparti();
				break;
			default: System.out.println("Erreur de saisie");
		}

	}

	public void pousseAliment(){
		for(Aliment a : potager){
			a.setNiveauDeMaturite(a.getNiveauDeMaturite()+1);
		}
	}

	public void recolteAliment(){
		System.out.print("Quel fruit ou legume voulez vous recolter?");
		String s = Utilitaires.saisieString();
		System.out.println(s);
		for(Aliment a : potager){
			if(s.equalsIgnoreCase(a.getNom())){
				System.out.println("je veux recolter "+s);
				if(a.getNiveauDeMaturite()==a.getDureePousse()){
					gardeManger.put(a, gardeManger.get(a)+1);
					potager.remove(a);
					System.out.println(gardeManger);
					Utilitaires.printPotager(potager);
				}
			}
		}
	}
}
