import java.util.Date;

public class Productos {
  /*
   * Le plantea desarrollar un programa Java que permita la gestión de una pequeña
   * empresa agroalimentaria que produce y empaca 2 tipos de productos: productos
   * frescos y productos congelados. Todos los productos se almacenan en cajas que
   * se
   * identifican con los siguientes datos: número de lote, fecha de caducidad y
   * cantidad
   * producida.
   */
  private int numLote;
  private String nombreProducto;
  private Date fechaCaducidad;
  private int cantidadProducida;
  private int caja;
  Productos(int numLote, Date fechaCaducidad, int cantidadProducida, String nombreProducto){
    this.cantidadProducida = cantidadProducida;
    this.fechaCaducidad = fechaCaducidad;
    this.nombreProducto = nombreProducto;
    this.numLote = numLote;
  }
  int getNumLotes() {
    return numLote;
  }
  Date getFechaCaducidad() {       
    return fechaCaducidad;
  }
  int getCantidadProducidas() {
    return cantidadProducida;
  }
  void setCaja(int caja){
    this.caja = caja;
  }
}

class ProductosFrescos{

}
class ProductosFrios extends Productos{
  private float temperaturaRecomendada;
  ProductosFrios(int numLote, Date fechaCaducidad, int cantidadProducida, String nombreProducto, float temperaturaRecomendada){
    super(numLote, fechaCaducidad, cantidadProducida, nombreProducto);
    this.temperaturaRecomendada = temperaturaRecomendada;
  }

}