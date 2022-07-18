package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaTO {
    public String idVenta, dni, fecha;
    public double descuntos ,subprecio, igv, precioTotal;
}
