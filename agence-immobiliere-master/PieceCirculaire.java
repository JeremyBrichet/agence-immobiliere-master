public class PieceCirculaire extends Piece {

    private double rayon;

    public PieceCirculaire(TypePiece typePiece, String niveau, double d) {
        super(typePiece, niveau);
        this.rayon = d;      
    }
        
    @Override
    public double surface() {
        double result = 0;
        result = Math.PI * (rayon * rayon);
        return result;
    }
    
}
