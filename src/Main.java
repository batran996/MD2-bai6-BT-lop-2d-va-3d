public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Class2D lop2 = new Class2D(3,3);
        System.out.println(lop2);
        Class3D lop3 = new Class3D(lop2.getX(), lop2.getY(), 5);
        System.out.println(lop3);
    }
}