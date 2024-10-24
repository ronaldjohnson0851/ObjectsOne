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