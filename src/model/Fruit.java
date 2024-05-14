package model;

public class Fruit extends Aliment{

	public Fruit(String nom, int dureePousse, int recoltePousse, float prix, float prixPourPlanter) {
		super(nom, dureePousse, recoltePousse, prix, prixPourPlanter);
	}


/*	@Override
	public String toString() {
		return super.toString() + "Fruit{" +
				"Nom='" + Nom + '\'' +
				", quantiteObtenuLorsDeLaRecolte=" + quantiteObtenuLorsDeLaRecolte +
				", dureeDeLaPoussePourMaturite=" + dureeDeLaPoussePourMaturite +
				", niveauDeMaturite=" + niveauDeMaturite +
				", prixdevente=" + prixdevente +
				", prixpourplanter=" + prixpourplanter +
				'}';
	}*/
}
