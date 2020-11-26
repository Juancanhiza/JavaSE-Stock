package stock;

public class Producto {
    
    public static void main(String[] args){
        Deposito deposito1 = new Deposito(1, "Deposito1");
        Producto producto1 = new Producto("Producto1", deposito1, 25000, 10);
        System.out.println(producto1.toString());
        producto1.venta(0);
        System.out.println("Queda en stock del producto1: " + producto1.getExistencia() + " unidades.");
    }
    
    private String nombre;
    private Integer precio;
    private Deposito deposito;
    private Integer existencia;
    
    public Producto(String nombre, Deposito deposito, Integer precio, Integer existencia){
        if (nombre!=null && !nombre.isEmpty() && deposito!=null && precio>0 && existencia>=0){
            this.nombre=nombre;
            this.deposito=deposito;
            this.precio=precio;
            this.existencia=existencia;
        }else{
            throw new IllegalArgumentException("Se ingreso valores incorrectos para el producto");
        }
    }
    
    public void venta(Integer vendidas){
        if (vendidas<=0){
            System.out.println("No se puede realizar la venta. La cantidad a vender debe ser mayor a cero");
        }
        else if (vendidas<=this.existencia){
            this.existencia-=vendidas;
        }else{
            System.out.println("No se puede realizar la venta. La cantidad a vender supera el stock del producto");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", deposito=" + deposito + ", existencia=" + existencia + '}';
    }
    
}
