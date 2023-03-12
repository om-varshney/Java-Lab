package JavaTutorial.headFirst;

public class Hippo extends Animal {
    private int age = 0;

    public Hippo() {
        this("baby hippo", 10);
    }

    public Hippo(String name) {
        this.setName(name);
    }

    public Hippo(String name, int age) {
        this(name);
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

}
