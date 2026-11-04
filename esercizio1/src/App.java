// Simulazione contesto ospedaliero: 
// Creazione di una classe "base" Person (classe astratta, attributi di base sono comuni a tutte le persone) e successiva creazione di alcune classi figlie quali Dottori, Infermieri e Pazienti.

public class App {
    public static void main(String[] args) throws Exception {

        // La classe Person (astratta) non può istanziare oggetti. Si procede con dottori e pazienti:

        // Oggetto Dottore
        Doctor d1 = new Doctor("Alfeo", "Sassaroli", "chirurgia generale");
        d1.infoPerson();

        // Oggetto Paziente
        Patient p1 = new Patient("Sor Savino", "Capogreco", "defecatio isterica");
        p1.infoPerson();

    }
}
