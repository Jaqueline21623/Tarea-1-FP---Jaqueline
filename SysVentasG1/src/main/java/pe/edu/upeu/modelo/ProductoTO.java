package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class ProductoTO {
   public String idProducto, nombreProd; 
   public String unidMed, idMod, porcentajeDescuento;
   public double precioProducto, utilidad, stock, cantMayor;
}
