/**
 * Created by bytegear on 05.10.17.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world!");
        }
    }

    public static int method(String s, int i){
        System.out.println(s);
        System.out.println(i);
        return 0;
    }

    public static void method2() {
        method("Hallo", 100);
    }

    public static void method3() {
        for (int i = 0; i < 5; ++i) {
            method2();
        }
    }

    public static void BRANCH() {
        System.out.println("BRANCH");
    }

    public void HALLO() {
        // nothing
    }

}
