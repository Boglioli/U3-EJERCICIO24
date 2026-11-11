public class Smartphone extends ClaseDispositivo {
    int megapixeles;
    int almacenamiento;

    public Smartphone(String modelo, String marca, double precioBase, int megapixeles, int almacenamiento) {
        super(modelo, marca, precioBase);
        this.megapixeles = megapixeles;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("camara: " + megapixeles + "mp");
        System.out.println("almacenamiento: " + almacenamiento + "gb");
    }
}