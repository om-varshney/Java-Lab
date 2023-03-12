package JavaTutorial.headFirst;

public class Main {
    public static void main(String[] args) {
        Hippo jolly = new Hippo("jolly");
        Hippo hippo = new Hippo();
        Hippo born = new Hippo();
        Hippo father = new Hippo("big hippo", 45);
        System.out.println(jolly.getName());
        System.out.println(hippo.getAge());
        System.out.println(hippo.getName());
        System.out.println(born.getName());
        System.out.println(father.getAge());
        System.out.println(father.getName());
        born.setName("bubbly");
        System.out.println(born.getName());
    }
}
