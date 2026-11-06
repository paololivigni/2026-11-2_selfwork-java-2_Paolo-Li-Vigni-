public class App {
    public static void main(String[] args) throws Exception {

        // Creazione oggetti
        Person p1 = new Person("Mario", "Rossi", 35);
        Person p2 = new Person("Mario", "Rossi", 35);

        // Verifica di uguaglianza (non soddisfatta)
        System.out.println(p1 == p2); // false
        
        // riferimenti diversi dei due oggetti
        System.out.println(p1); //Person@1dbd16a6
        System.out.println(p2); //Person@7ad041f3

        // Metodo .equals: caso 1 - metodo .equals() di default
        System.out.println(p1.equals(p2)); // false - il metodo .equals di default si comporta come "=="

        // Metodo .equals: caso 2 - metodo .equals() sovrascrittura (override)
        System.out.println(p1.equals(p2)); // true - il metodo .equals sovrascritto soddisfa la condizione
        
    }
}
