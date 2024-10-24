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