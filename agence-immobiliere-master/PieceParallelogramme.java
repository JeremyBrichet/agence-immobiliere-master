public class PieceParallelogramme extends Piece{

    private int base;
    private int hauteur;

    public PieceParallelogramme(TypePiece typePiece, String niveau, int base, int hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
        
    }

    @Override
    public double surface() {
        double result = 0;
        result = base * hauteur;
        return result;
    }
    
}
