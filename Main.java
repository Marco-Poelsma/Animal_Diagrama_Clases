public class Main {
    public static void main(String[] args) {
        Animal pajarito = new Volador("pajarito", 0, 43, 5);
        Animal gato = new Terrestre("gato", 2, 2, 0);
        
        System.out.println(pajarito.toString());
        pajarito.mover(new Posicion(3, 4, 5));
        System.out.println(pajarito.toString());

        System.out.println(gato.toString());
        gato.mover(new Posicion(4, 6, 3));
        System.out.println(gato.toString());
    }
}
