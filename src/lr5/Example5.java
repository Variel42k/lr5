package lr5;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(new input5());
        input5.get();
        System.out.println(new input5(12));
        input5.get();
        System.out.println(new input5(120));
        input5.get();
    }
}

@SuppressWarnings("static-access")
class input5 {
    private static int f_1;

    input5() {
        this.set();
    }

    input5(int var_1) {
        this.set(var_1);
    }

    public void set() {
        this.f_1 = 0;
    }

    public void set(int var_1) {
        this.f_1 = (var_1 < 100) ? var_1 : 100;
    }

    public static void get() {
        System.out.println(f_1);
    }
}
