public class ClaseDispositivo {
    String modelo;
    String marca;
    double precioBase;
    public ClaseDispositivo(String modelo, String marca, double precioBase) {
        this.modelo = modelo;
        this.marca = marca;
        this.precioBase = precioBase;
    }
    public void mostrarInformacion() {
        System.out.println("modelo: " + modelo);
        System.out.println("marca: " + marca);
        System.out.println("precio base: " + precioBase);
    }
}
