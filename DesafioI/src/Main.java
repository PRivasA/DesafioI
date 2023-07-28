// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Creamos algunos productos y una orden
        Producto producto1 = new Producto(1, "Cuaderno", 52, 5);
        Electronico producto2 = new Electronico(2, "Tablet", 700.59, 3, "Huawei");
        Producto producto3 = new Producto(3, "Cereal", 10.82, 7);
        Orden orden = new Orden();

        // Agregamos productos a la orden
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);

        // Mostramos los detalles de la orden
        orden.mostrarDetalles();
    }
}