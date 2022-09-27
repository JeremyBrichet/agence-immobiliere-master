public class PieceQuadrilatere extends Piece {

    private double longueur;
    private double largeur;

    public PieceQuadrilatere(TypePiece typePiece, String niveau, double d, int largeur) {
        super(typePiece, niveau);  
        this.largeur = largeur;
        this.longueur = d;
    }

    @Override
    public double surface() {
        double result = 0;
        result = longueur * largeur;
        return result;
    }
    
}
