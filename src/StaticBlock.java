public class StaticBlock {
    static{
        System.out.println("static 1");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
    static{
        System.out.println("static 2");
    }
}
