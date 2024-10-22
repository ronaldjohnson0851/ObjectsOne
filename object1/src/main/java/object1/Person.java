// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30);

        /* Now you can use the Object `person1` */

    }
}
public class Titan {
    private String name;
    private int age;
    private String superhero;

    public Titan(String name, int age, String superhero) {
        this.name = name;
        this.age = age;
        this.superhero = superhero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSuperhero() {
        return superhero;
    }

    public void setSuperhero(String superhero) {
        this.superhero = superhero;
    }
}

public class Cryptid {
    private String creature;
    private String legend;
    private String roar;

    public Cryptid(String creature, String legend, String roar) {
        this.creature = creature;
        this.legend = legend;
        this.roar = roar;
    }
    public String getCreature() {
        return make;
    }

    public void setCreature(String creature) {
        this.make = make;
    }
    public String getLegend() {
        return make;
    }

    public void setLegend(String legend) {
        this.make = make;
    }
    public String getRoar() {
        return make;
    }

    public void setRoar(String roar) {
        this.make = make;
    }

    Cryptid[] cryptids = new Cryptid[5];

    Cryptid cryptid1 = new Person("Nessy", "Monster", "Blubblub");
    Cryptid cryptid2 = new Person("Bigfoot", "He who walks weird", "Weird grunt");
    Cryptid cryptid3 = new Person("Skunkape", "Smelly", "Loud cry");
    Cryptid cryptid4 = new Person("Mothman", "Bad omen", "...");
    Cryptid cryptid5 = new Person("Wendigo", "Cannibal", "Last thing you hear");


    cryptid[0] = cryptid1;
    cryptid[1] = cryptid2;
    cryptid[2] = cryptid3;
    cryptid[3] = cryptid4;
    cryptid[4] = cryptid5;


};