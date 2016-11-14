public class Main {
    private static int globalid =0;
    private Main() {}//позволяет запретить создавать объекты класса

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        mymethod();
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        mymethod2();
        Main.globalid = 5;
        System.out.println(globalid);

        //Main.incremementId() не сработает потому что не статик,
        //т.е. должно быть обращение к конкретному объекту
        //а его еще не существует
        new Main().incrementId();

        Main.globalid = 8;//отностится к классу а не к объекту
    }

    private static void mymethod() {
        System.out.println("lhflkjhfd;l");
    }

    public void incrementId() {
        Main.globalid++;
    }

    private static void mymethod2() {
        System.out.println("lhflkjhfd;l");
    }

}
