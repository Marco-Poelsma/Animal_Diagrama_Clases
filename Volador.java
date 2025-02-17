public class Volador extends Animal {
    @Override
    public void mover(Posicion pos) {
        System.out.println("El " + nombre + " vuela a la posicion " + pos.toString());
        this.posicion = pos;
    }

    public Volador(String nombre, double x, double y, double z) {
        super(nombre, x, y, z);
    }

    public Volador(String nombre) {
        super(nombre, 0, 0, 0);
    }

    public Volador() {
        super(null, 0, 0,0);
    }
}
