public class Posicion {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setz(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "[ " + x + " , " + y + " , " + z + " ]";
    }

    public Posicion(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Posicion() {
        this(0, 0, 0);
    }
}
