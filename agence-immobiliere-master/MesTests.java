import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MesTests {
    
    private static final double DELTA = 0;

	@Test
    public void PieceCirculaireTest(){
            Piece maPiece = new PieceCirculaire(null, null, 5);
            assertEquals(78.5, maPiece.surface(), 1e-2);
          
    }

    @Test
    public void PieceTriangulaireTest(){
            Piece maPiece = new PieceTriangulaire(null, null, 4, 6);
            assertEquals(12, maPiece.surface(), 1e-2);
          
    }

    @Test
    public void PieceParallelogrammeTest(){
            Piece maPiece = new PieceParallelogramme(null, null, 2, 3);
            assertEquals(6, maPiece.surface(), 1e-2);
          
    }

    @Test
    public void PieceQuadrilatereTest(){
            Piece maPiece = new PieceQuadrilatere(null, null, 5, 5);
            assertEquals(25, maPiece.surface(), 1e-2);
          
    }

    @Test
    public void PieceTrapezoidaleTest(){
            Piece maPiece = new PieceTrapezoidale(null, null, 2, 6,5);
            assertEquals(10, maPiece.surface(), 1e-2);
          
    }

    @Test
    public void surfaceHabitableTest(){
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece salon = new TypePiece(TypePiece.SALON, true, true);
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        TypePiece salleDeBain = new TypePiece(TypePiece.SALLE_DE_BAIN, true, false);
        TypePiece Wc = new TypePiece(TypePiece.WC, true, false);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);

        Appartement appartement = new Appartement("16 rue du lac", "ANNECY", "74000", null, false, "1er étage");
        appartement.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        appartement.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));
        appartement.ajouterPiece(new PieceCirculaire(salon, "0", 2.1));
        appartement.ajouterPiece(new PieceQuadrilatere(Wc, "0", 1.5, 2));
        appartement.ajouterPiece(new PieceQuadrilatere(salleDeBain, "0", 2, 2));
        appartement.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 3));
        assertEquals(12, appartement.surfaceHabitable(), DELTA); 
        assertEquals(9, appartement.surfaceHabitable(), DELTA);   
    }

    @Test
    public void surfaceNonHabitableTest(){
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece salon = new TypePiece(TypePiece.SALON, true, true);
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        TypePiece salleDeBain = new TypePiece(TypePiece.SALLE_DE_BAIN, true, false);
        TypePiece Wc = new TypePiece(TypePiece.WC, true, false);
        TypePiece Cave = new TypePiece(TypePiece.CAVE, false, false);

        Appartement appartement = new Appartement("16 rue du lac", "ANNECY", "74000", null, false, "1er étage");
        appartement.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        appartement.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));
        appartement.ajouterPiece(new PieceCirculaire(salon, "0", 2.1));
        appartement.ajouterPiece(new PieceQuadrilatere(Wc, "0", 1.5, 2));
        appartement.ajouterPiece(new PieceQuadrilatere(salleDeBain, "0", 2, 2));
        appartement.ajouterPiece(new PieceQuadrilatere(Cave, "-1", 3, 3));
        assertEquals(15, appartement.surfaceNonHabitable(), DELTA); 
        assertEquals(5, appartement.surfaceNonHabitable(), DELTA);   
    }
    
    
}
