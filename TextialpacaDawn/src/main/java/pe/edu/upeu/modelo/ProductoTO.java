package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class ProductoTO {
    public String idProducto, nombreProd;
    public String idCat, idMod; 
    public String unidMed, porcentajeDescuento;
    public double precioProducto, utilidad, stock, cantMayor;
}
