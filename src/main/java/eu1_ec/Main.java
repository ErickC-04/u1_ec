package eu1_ec;

import eu1_ec.Extensiones.DescuentoBase;
import eu1_ec.Extensiones.DescuentoVip;
import eu1_ec.Extensiones.SinDescuento;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main  implements  QuarkusApplication{


    @Inject 
    PedidoService pedidoService ;



    @Inject 
    DescuentoBase descuentoBase ;

    @Inject 
    DescuentoVip descuentoVip ;

    @Inject 
    SinDescuento SinDescuento ;

    public static void main(String[] args) {

        Quarkus.run(Main.class , args); {

        }

    }

    @Override
    public int run(String... args) throws Exception {
     
        System.out.println(" INICIANDO LA APLICACION");
      Pedido pedido1 =  new Pedido("P001", "Laptop", 10000, "VIP");
      pedidoService.realizar(pedido1, SinDescuento  );
    

      Pedido pedido2 =  new Pedido("P002", "Mouse", 100, "Normal");
     pedidoService.realizar(pedido2, descuentoVip );
      
      Pedido pedido3 =  new Pedido("P003", "Teclado", 200, "VIP");
     pedidoService.realizar(pedido3, descuentoBase);
      

     System.out.println(" 172219-EC");



        return 0;
    }
}
