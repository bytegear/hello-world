/**
 * Created by bytegear on 05.10.17.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world!");
        }
    }

    public int method(String s, int i){
        System.out.println(s);
        System.out.println(i);
        return 0;
    }

    public void method2() {
        method("Hallo", 100);
    }

    public void method3() {
        for (int i = 0; i < 5; ++i) {
            method2();
        }
    }

    public static void BRANCH() {
        System.out.println("BRANCH");
    }

}
