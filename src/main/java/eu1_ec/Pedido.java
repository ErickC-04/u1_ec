package eu1_ec;

public class Pedido {

     private String codigo ;
     private String Producto ;
     private Integer ValorOriginal ;
     private String cliente ;
     public Pedido(String codigo, String producto, Integer valorOriginal, String cliente) {
        this.codigo = codigo;
        Producto = producto;
        ValorOriginal = valorOriginal;
        this.cliente = cliente;
    }
     public String getCodigo() {
         return codigo;
     }
     public void setCodigo(String codigo) {
         this.codigo = codigo;
     }
     public String getProducto() {
         return Producto;
     }
     public void setProducto(String producto) {
         Producto = producto;
     }
     public Integer getValorOriginal() {
         return ValorOriginal;
     }
     public void setValorOriginal(Integer valorOriginal) {
         ValorOriginal = valorOriginal;
     }
     
     public String getCliente() {
         return cliente;
     }
     public void setCliente(String cliente) {
         this.cliente = cliente;
     }
}
