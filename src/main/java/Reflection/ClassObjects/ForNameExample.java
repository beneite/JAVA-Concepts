package Reflection.ClassObjects;

public class ForNameExample {

    public int a;
    public void display(){

    }

    public static void main(String[] args){

        try {
            Class c = Class.forName("Reflection.ClassObjects.ForNameExample");
            System.out.println("Name:"+c.getName());
            System.out.println("Simple Name:"+c.getSimpleName());

            Package pkg = c.getPackage();
            System.out.println("Package: " + pkg.getName());


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
