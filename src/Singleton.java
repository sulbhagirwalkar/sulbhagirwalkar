public class Singleton {
    public static void main(String[] args) {
      Abc obj = Abc.getInstance();
        Abc obj1 = Abc.obj;
    }
}
class Abc{

    static Abc obj = new Abc();
    private Abc(){

    }

    public static Abc getInstance(){
        return obj;
    }

}
