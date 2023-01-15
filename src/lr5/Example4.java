package lr5;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(new input4(12, 'A'));
        input4.get();
        System.out.println(new input4(65.1267));
        input4.get();
    }
}

@SuppressWarnings("static-access")
class input4 {

    static int f_1;
    static char f_2;

    input4(int var_1, char var_2) {
        this.f_1 = var_1;
        this.f_2 = var_2;
    }

    input4(double var_3) {
        this.f_1 = (int) ((var_3 * 100) % 100);
        this.f_2 = (char) ((int) var_3);
    }

    public static void get() {
        System.out.println(f_1);
        System.out.println(f_2);
    }
}
