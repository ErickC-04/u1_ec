package eu1_ec.Extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVip implements Descuento{

    @Override
    public double ImprimirDescuento(double descuento ) {
        double total = descuento * 0.10 ;
        
       return total ;
        
    }


}
