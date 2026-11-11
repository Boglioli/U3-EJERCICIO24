public class Laptop extends ClaseDispositivo {
    String procesador;
    int memoriaRam;
    public Laptop(String modelo, String marca, double precioBase, String procesador, int memoriaRam) {
        super(modelo, marca, precioBase);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("procesador: " + procesador);
        System.out.println("memoria RAM: " + memoriaRam + "gb");
    }
}
