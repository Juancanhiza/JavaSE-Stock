package stock;

public class Deposito {
    private Integer id;
    private String nombre;
    
    public Deposito(Integer id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    
    public Integer getId(){
        return this.id;
    } 
    public String getNombre(){
        return this.nombre;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Deposito{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
