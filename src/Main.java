public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car A = new Car("A");
        Car B = new Car("B");
        Car C = new Car("C");
        Thread thread1 = new Thread(A);
        Thread thread2 = new Thread(B);
        Thread thread3 = new Thread(C);
        System.out.println("100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
