public class PieceTriangulaire extends Piece {

    private double base;
    private double hauteur;

    public PieceTriangulaire(TypePiece typePiece, String niveau, int uneBase, double d) {
        super(typePiece, niveau);
        this.base = uneBase;
        this.hauteur = d;
        
    }

    @Override
    public double surface() {
        double result = 0;
        result = 1/2 * base * hauteur;
        return result;
    }
    
}
