package entite;

public class Trajet {

	private Long trajetId;
    private Bus bus;
    private String villeDepart;
    private String villeArrivee;
    private String dateDepart;
    private String heureDepart;
    private int placesTotales;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello trajet");

	}

public Trajet(long l, String string, String string2, String string3, String string4, String string5, int i) {

  this.trajetId = trajetId;
  this.bus = bus;
  this.villeDepart = villeDepart;
  this.villeArrivee = villeArrivee;
  this.dateDepart = dateDepart;
  this.heureDepart = heureDepart;
  this.placesTotales = placesTotales;
}

public Long getTrajetId() {
  return trajetId;
}

public void setTrajetId(Long trajetId) {
  this.trajetId = trajetId;
}




public String getVilleDepart() {
  return villeDepart;
}

public void setVilleDepart(String villeDepart) {
  this.villeDepart = villeDepart;
}

public String getVilleArrivee() {
  return villeArrivee;
}

public void setVilleArrivee(String villeArrivee) {
  this.villeArrivee = villeArrivee;
}

public String getDateDepart() {
  return dateDepart;
}

public void setDateDepart(String dateDepart) {
  this.dateDepart = dateDepart;
}

public String getHeureDepart() {
  return heureDepart;
}

public void setHeureDepart(String heureDepart) {
  this.heureDepart = heureDepart;
}

public int getPlacesTotales() {
  return placesTotales;
}

public void setPlacesTotales(int placesTotales2) {
  this.placesTotales = placesTotales2;
}

public void setBus(String bus2) {
	// TODO Auto-generated method stub
	
}

public void setPlacesTotales(String placesTotales2) {
	// TODO Auto-generated method stub
	
}

public String getBus() {
	// TODO Auto-generated method stub
	return null;
}
}
