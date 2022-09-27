public class Appartement extends BienImmobilier {

    private String etage;
    private boolean ascenseur = false;

	public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, boolean ascenseur, String etage) {
		super(rue, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = ascenseur;
	}
    public String typeBien(){
        int result = 0;
        for(Piece unepiece : pieces){
            if (unepiece.getTypePiece().isPiece()) {
                result ++;
            } 
		}
        String chaine = "T" + result;
        if (result > 7) {
            chaine = "T7+";
        }
        return chaine;
    }

    @Override
    public String toString() {
        String resultat ="";
        resultat = "Appartement de type "+ typeBien();
        if(ascenseur){
            resultat += " avec ascenseur ";
        }
        resultat += " situé au " + etage + " ";
        resultat += super.toString();
        return resultat;
    }
}
