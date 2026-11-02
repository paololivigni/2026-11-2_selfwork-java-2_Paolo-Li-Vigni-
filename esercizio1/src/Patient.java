// Creazione classe figlia Patient

public class Patient extends Person{

    String pathology;

    public Patient(String name, String surname, String pathology){
        super(name, surname);
        this.pathology = pathology;
    }

    // Seppur omissibile, ricorro all'uso del this.
    public void info(){
        System.out.println("Salve, sono " + this.name + " " + this.surname + " e mi è stato diagnosticato " + this.pathology + ".");
    }
}
