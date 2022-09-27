public abstract class Piece {

    private String niveau;
    private TypePiece typePiece;


    public Piece (TypePiece typePiece, String niveau){
        this.typePiece = typePiece;
        this.niveau = niveau;   
    }

    public abstract double surface();

    public String toString(){
        return typePiece + "surface:" + surface() + "m² \n";
    }

    public String getNiveau() {
        return niveau;
    }

    public TypePiece getTypePiece() {
        return typePiece;
    }
    
}
