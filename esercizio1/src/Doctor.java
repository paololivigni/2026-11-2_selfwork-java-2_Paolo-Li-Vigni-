// Creazione classe figlia Doctor

public class Doctor extends Person{

    // Creazione reparto
    String ward;
    
    // Costruttore
    public Doctor(String name, String surname, String ward){
            super(name, surname);
            this.ward = ward;
    }

    // Seppur omissibile, ricorro all'uso del this.
    @Override 
    public void infoPerson(){
        System.out.println("Salve, sono il medico " + this.name + " " + this.surname + " e opero nel reparto " + this.ward + ".");
    }


}
