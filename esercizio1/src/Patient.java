// Creazione classe figlia Patient

public class Patient extends Person{

    String pathology;

    public Patient(String name, String surname, String pathology){
        super(name, surname);
        this.pathology = pathology;
    }

    // Seppur omissibile, ricorro all'uso del this.
    @Override 
    public void infoPerson(){
        System.out.println("Sono il paziente " + this.name + " " + this.surname + " e sono ricoverato per " + this.pathology + ".");
    }
}
