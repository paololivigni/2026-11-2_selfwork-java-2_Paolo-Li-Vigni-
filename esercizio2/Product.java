// Creazione classe Prodotto

// Creazione classe Prodotto

public class Product {

    private String name;
    private double price;
    private int amount;
    private int code;
    private int pin;

    public Product(String name, double price, int amount, int code, int pin) {
        this.name = name;

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Prezzo non valido, impostato a 0.");
            this.price = 0;
        }

        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Quantità non valida, impostata a 0.");
            this.amount = 0;
        }

        this.code = code;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price, int pin) {
        if (this.pin == pin && price > 0) {
            this.price = price;
            System.out.println("Il prezzo del prodotto " + this.name + " è stato modificato. Il nuovo prezzo è di: " + this.price + " euro.");
        } else if (this.pin == pin && price <= 0) {
            System.out.println("Valore non valido! Il prezzo deve essere maggiore di zero!");
        } else {
            System.out.println("Accesso negato! Non hai il permesso per modificare il prezzo del prodotto " + this.name + ".");
        }
    }

    public int getAmount() {
        return amount;
    }

    public void soldUnit(int code) {
        if (this.amount > 0 && this.code == code) {
            this.amount--;
            System.out.println("E' stato acquistato " + this.name + ", in magazzino rimangono " + this.amount + " unità.");
        } else if (this.amount > 0 && this.code != code) {
            System.out.println("Codice errato! Operazione negata.");
        } else {
            System.out.println("In magazzino non sono presenti unità del prodotto richiesto.");
        }
    }

    public void infoProduct() {
        System.out.println("Il prodotto " + this.name + " costa " + this.price + " e le unità in magazzino ammontano a: " + this.amount);
    }
}
