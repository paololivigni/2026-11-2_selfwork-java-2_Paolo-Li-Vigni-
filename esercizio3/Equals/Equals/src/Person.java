public class Person {

    
    public String name;
    public String surname;
    public int age;

    public Person (String name, String surname, int age){

        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    @Override
    public boolean equals(Object obj) {

        // condizione uguaglianza tra oggetto Person e obj (parametro)
        if(this == obj) return true; 
        // due oggetti sono uguali se hanno il medesimo riferimento

        // condizione uguaglianza tra classi di oggetti
        if (obj == null || this.getClass() != obj.getClass()) return false; 
        // i due oggetti risultano diversi se hanno classi differenti

        // assegnazione del generico oggetto Person ad una variabile "p"
        Person p = (Person)obj;

        // condizione di uguaglianza tra i parametri dei due oggetti
        if(this.name == p.name && this.surname == p.surname && this.age == p.age) return true;

        return false; // metodo ritorna di default "false"
    }
}
