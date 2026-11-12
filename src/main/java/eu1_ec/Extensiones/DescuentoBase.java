package eu1_ec.Extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoBase implements Descuento{

    @Override
    public double ImprimirDescuento(double descuento ) {
        double total2 = descuento * 0.05 ;
        
       return total2 ;
        
    }


}

