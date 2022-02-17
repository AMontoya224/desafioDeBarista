public class Item{
    private String nombre;
    private double precio;

    public Item(){
        this.nombre = "N/A";
        this.precio = 0.0;
    }
    
    public Item( String nombre, double precio ){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    public void setNombre( double precio ){
        this.precio = precio;
    }
}