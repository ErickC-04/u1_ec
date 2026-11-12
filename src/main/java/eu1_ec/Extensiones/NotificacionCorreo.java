package eu1_ec.Extensiones;

import eu1_ec.Pedido;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionCorreo implements Notificacion {

    @Override
    public void notificar(Pedido pedido) {
        System.out.println(" El pedido Correo ");
        System.out.println(" Pedido :" + pedido.getCliente());
         System.out.println(" Producto :" + pedido.getProducto());
         System.out.println(" Total" + pedido.getValorOriginal());
        
    }


}
