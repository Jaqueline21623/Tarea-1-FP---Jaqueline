package pe.edu.upeu.textialpaca;

import java.io.Console;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ClienteDao;
import pe.edu.upeu.dao.ModeloDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentasDao;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT=new LeerTeclado();
    UsuarioTO user;

    public void login() {
        System.out.println("***********Validar sus Credenciales***********");
        user=new UsuarioTO();
        user.setUsuario(leerT.leer("", "Ingrese su Usuario"));
        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] clavex=cons.readPassword();
        user.setClave(String.valueOf(clavex));
        if (new UsuarioDao().loginValidar(user.getUsuario(), user.getClave())) {
            menuPrincial();
        }else{
            System.out.println("Intente Otra vez!");
            login();
        }
    }

    public void menuPrincial() {
        System.out.println("********************Bienvenidos al Sistema de Ventas******************");
        String valorX="1=Registrar Usuario\n"+"2=Registrar cliente\n"+
                "3=Registrar Modelo\n"+"4=Crear Producto\n"+"5=Ventas\n6=Reporte Ventas\n"+
                "7=Reporte Ventas2\n"+"8=Registrar Categoria\n";
        int opciones=0;
        do {
            switch (opciones) {
                case 1: new UsuarioDao().crearUsuario(); break;
                case 2: new ClienteDao().crearCliente();break;
                case 3: new ModeloDao().crearModelo();break;
                case 4: new ProductoDao().crearProducto();break;
                case 5: new VentasDao().registroVentaGeneral();break;
                case 6: new VentasDao().reporteVentas();break;
                case 7: new VentasDao().reporteVentasRangoFecha();break;
                case 8: new CategoriaDao().crearCategoria();break;
                default: System.out.println("Opcion erronea!"); break;
            }
            char continuar=leerT.leer("", "Desea continuar? S=si/N=no")
                            .toLowerCase()
                            .charAt(0)=='s'?'s':'n';
            if (continuar=='s') {
                opciones=leerT.leer(0, "Eliga la siguiente operacion:\n"+valorX);
            }else{opciones=0;}

        } while (opciones!=0);
        
    }
}
