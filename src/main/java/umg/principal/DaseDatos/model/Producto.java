package umg.principal.DaseDatos.model;

public class Producto {
    private int idProducto;
    private String descripcion;
    private String origen;
    private int peso;
    private int precio;
    private int cantidad;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return cantidad;
    }

    public void setCantidad(int existencia) {
        this.cantidad= existencia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Constructor
    public Producto(int idProducto, String descripcion, String origen,int precio,int existencia) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.origen = origen;
        this.precio = precio;
        this.cantidad = existencia;
    }




    public Producto() {
    }

    // Getters y setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
