public class Main {
    public static void main(String[] args) {
        Smartphone celular = new Smartphone("Galaxy S24", "Samsung", 1200000, 108, 128);
        Laptop computadora = new Laptop("MacBook Pro", "Apple", 1500000, "M1", 16);

        System.out.println("Información del Smartphone:");
        celular.mostrarInformacion();

        System.out.println("\nInformación de la Laptop:");
        computadora.mostrarInformacion();
    }
}