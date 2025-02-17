public class Terrestre extends Animal {
    @Override
    public void mover(Posicion pos) {
        System.out.println("El " + nombre + " camina a " + pos.toString());
        this.posicion = pos;
    }

    public Terrestre(String nombre, double x, double y, double z) {
        super(nombre, x, y, z);
    }

    public Terrestre(String nombre) {
        super(nombre, 0, 0, 0);
    }

    public Terrestre() {
        super(null, 0, 0,0);
    }
}
