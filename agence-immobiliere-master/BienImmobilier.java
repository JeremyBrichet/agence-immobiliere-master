import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BienImmobilier {

    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    protected ArrayList<Piece> pieces;

    public BienImmobilier(String rue, String ville, String codePostal, Vendeur vendeur) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
    } 

    public double surfaceHabitable() {
        double result = 0;
        for(Piece unepiece : pieces){
            if (unepiece.getTypePiece().isSurfaceHabitable()) {
                result += unepiece.surface();
            } 
		}
        return result;
    }
      
    public double surfaceNonHabitable() {
        double result = 0;
        for(Piece unepiece : pieces){
            if (unepiece.getTypePiece().isSurfaceHabitable() == false) {
                result += unepiece.surface() ;
            }
		}
        return result;
    } 

    public void ajouterPiece(Piece unePiece){
		if(unePiece !=null){
			pieces.add(unePiece);
		}
	}

    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "\nLocalisation : " +rue +" " + codePostal+ " " + ville + 
        "\n \n Description du bien : \n" +
        pieces.toString()  +  
        "\nPour une surface habitable de : " + 
        numberFormat.format(surfaceHabitable())+ 
        " m2 et une surface non habitable de : " + 
        numberFormat.format(surfaceNonHabitable())+" m2.";
    }
    public Vendeur getVendeur() {
        return vendeur;
    }
}
