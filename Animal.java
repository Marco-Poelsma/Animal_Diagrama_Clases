public abstract class Animal implements Mover{
    protected Posicion posicion = new Posicion();
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "[ " + nombre + " , " + posicion.getX() + " , " + posicion.getY() + " , " + posicion.getZ() + " ]";
    }

    public void setNombre(String nombre, double x, double y, double z) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Animal(String nombre, double x, double y, double z) {
        this.nombre = nombre;
        this.posicion = new Posicion(x, y, z);
    }

    public Animal(String nombre) {
        this(nombre, 0, 0, 0);
    }

    public Animal() {
        this(null, 0, 0,0);
    }
}