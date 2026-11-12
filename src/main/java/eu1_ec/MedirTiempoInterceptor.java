package eu1_ec;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@MedirTiempo 
@Priority (Interceptor.Priority.APPLICATION  +1 )
public class MedirTiempoInterceptor {

    @AroundInvoke 
    public Object medir (InvocationContext context) throws Exception{
        System.out.println(" Midiendo tiempo");
        Pedido pedido = (Pedido) context.getParameters()[0];
        long init = System.currentTimeMillis();
        Object resultado = context.proceed() ;
        long fin = System.currentTimeMillis() - init ;
        System.out.println(" DUracion" + pedido.getCodigo() + fin);

        return resultado ;
    }

}
