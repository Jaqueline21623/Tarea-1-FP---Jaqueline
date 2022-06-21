package pe.edu.upeu.modelo;

public class CategoriaTO {
    public String idCal;
    public String nombreCat;

    

    public CategoriaTO(String idCal, String nombreCat) {
        this.idCal = idCal;
        this.nombreCat = nombreCat;
    }
    public String getIdCal() {
        return idCal;
    }
    public void setIdCal(String idCal) {
        this.idCal = idCal;
    }
    public String getNombreCat() {
        return nombreCat;
    }
    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
    
}
