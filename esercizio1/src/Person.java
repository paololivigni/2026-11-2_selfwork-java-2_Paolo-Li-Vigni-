//Creazione classe principale ("base")
abstract class Person {

    // Attributi
    public String name;
    public String surname;

    // Costruttore
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    // Metodo
    public void info(){
        System.out.println("Salve, sono " + this.name + " " + this.surname);
    }
}