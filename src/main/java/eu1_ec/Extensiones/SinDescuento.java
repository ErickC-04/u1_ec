package eu1_ec.Extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class SinDescuento implements Descuento{

    @Override
    public double ImprimirDescuento(double descuento ) {
        double total = descuento  ;
        
       return total ;
        
    }


}

