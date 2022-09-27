public class Annonce {
    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobilier logement;

    public static double COEF_NON_HABITABLE = 0.25;

	public Annonce(String reference, String date, String titre, double prixM2habitable, BienImmobilier logement) {
		this.reference = reference;
		this.date = date;
		this.titre = titre;
		this.prixM2Habitable = prixM2habitable;
		this.logement = logement;
	}

    public double prix(){
        double result = 0;
        result = logement.surfaceHabitable() * prixM2Habitable + logement.surfaceNonHabitable() * prixM2Habitable * COEF_NON_HABITABLE;
        return result; 
		}  

        @Override
    public String toString() {
        return "\n " + titre + "avec vue sur le Lac d'Annecy" +
        "\n "+ reference + "du" + date + 
        "\n "+ logement.toString()  +  
        "\n " + prixM2Habitable +
        "\n " + prixM2Habitable * COEF_NON_HABITABLE + 
        "\n" + prix() +
        "\n" + logement.getVendeur().getEmail() + 
        "\n" + logement.getVendeur().getNumeroTelephone();
    }     
}