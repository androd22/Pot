package model;

public class Legume extends Aliment{

	public Legume(String nom, int dureePousse, int recoltePousse, float prix, float prixPourPlanter) {
		super(nom, dureePousse, recoltePousse, prix, prixPourPlanter);
	}


/*	@Override
	public String toString() {
		return super.toString() + "Legume{" +
				"Nom='" + Nom + '\'' +
				", dureeDeLaPoussePourMaturite=" + dureeDeLaPoussePourMaturite +
				", quantiteObtenuLorsDeLaRecolte=" + quantiteObtenuLorsDeLaRecolte +
				", niveauDeMaturite=" + niveauDeMaturite +
				", prixdevente=" + prixdevente +
				", prixpourplanter=" + prixpourplanter +
				'}';
	}*/
}
