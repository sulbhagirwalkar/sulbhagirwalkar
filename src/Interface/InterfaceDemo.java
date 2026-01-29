package Interface;

public class InterfaceDemo implements Demo{
    @Override
    public void show(int item) {
        System.out.println("the Item is "+ Demo.item);
    }

    @Override
    public int get() {
        return Demo.age;
    }

    public static void main(String[] args) {
         int aage = Demo.age;
         String name = Demo.item;
        System.out.println(aage + name);
       // System.out.println("Interface Demo is" );
    }
}
