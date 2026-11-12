package eu1_ec;

import eu1_ec.Extensiones.Descuento;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped 
public class PedidoService {


    @MedirTiempo 
    public String realizar(Pedido pedido, Descuento descuento )  {
        System.out.println(" realizando el pedido :" );
         System.out.println(" Codigo :"  + pedido.getCodigo());
         System.out.println(" Producto :" +  pedido.getProducto());
         System.out.println(" Valor original :" + pedido.getValorOriginal());
         System.out.println(" Cliente :" + pedido.getCliente());


         descuento.ImprimirDescuento(0.10);
         
         return " Se a realizado el pedido correctamente" ; 
    }

}
