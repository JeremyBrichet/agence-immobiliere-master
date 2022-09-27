public class PieceTrapezoidale extends Piece{

    private int base;
    private int hauteur;
    private int Base;

    public PieceTrapezoidale(TypePiece typePiece, String niveau, int petiteBase, int laHauteur, int grandeBase) {
        super(typePiece, niveau);
        this.base = petiteBase;
        this.hauteur = laHauteur;
        this.base = grandeBase ;        
    }

    @Override
    public double surface() {
        double result = 0;
        result = 1/2 * hauteur * (Base * base);
        return result;
    }
    
}
