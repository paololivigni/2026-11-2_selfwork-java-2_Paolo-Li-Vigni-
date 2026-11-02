// Simulazione contesto magazzino: 
// Creazione di una classe Prodotto (nome prodotto, prezzo prodotto, quantità prodotto in giacenza, codice di lettura per monitorare giacenza in magazzino). Dichiarati quanti pezzi rimangono in magazzino.

public class App {

    public static void main(String[] args) {

        Product laptop = new Product("Asus Zephyrus", 2409.99, 2, 7285, 12345);
        laptop.infoProduct();
        
        // laptop.price = 1000;
        laptop.soldUnit(1023);

        // monitoraggio unità prodotto
        laptop.soldUnit(7285);
        laptop.soldUnit(7285);
        laptop.soldUnit(7285);

        laptop.setPrice(1299.99, 12456);
        laptop.setPrice(1299.99, 12345);
        laptop.setPrice(-500,12345);

    }
}
