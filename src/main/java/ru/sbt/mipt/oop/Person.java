package main.java.ru.sbt.mipt.oop;



public class Person {

    private boolean man; // man - true, woman - false
    private String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public String sayName () {
        return this.name;
    }

    public String areYouMarried () {
        if (this.spouse != null) {
            return "Yes, this is " + this.spouse.sayName();
        } else {
            return "No, I'm alone";
        }
    }


    public boolean marry(Person person) {
        if (this.man != person.man && this.spouse != person) {
            if (this.spouse != null) {
                this.divorce();
            }
            if (person.spouse != null) {
                person.divorce();
            }

            this.spouse = person;
            person.spouse = this;
            return true;

        } else {
            return false;
        }

    }


    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        } else {
            return false;
        }
    }
}
