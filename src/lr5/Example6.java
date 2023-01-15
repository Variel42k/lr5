package lr5;

public class Example6 {
    public static void main(String[] args) {
        System.out.println(new input6(12));
        input6.get();
        System.out.println(new input6(20, 4));
        input6.get();
    }
}

@SuppressWarnings("static-access")
class input6 {
    private static int min;
    private static int max;

    input6(int arg1){
        set(arg1);
    }

    input6(int arg1, int arg2){
        set(arg1, arg2);
    }

    void set(int arg1) {
        if (arg1 < 0) {
            this.min = arg1;
            this.max = 0;
        } else {
            this.min = 0;
            this.max = arg1;
        }
    }

    void set(int arg1, int arg2) {
        if (arg1 < arg2) {
            this.min = arg1;
            this.max = arg2;
        } else {
            this.min = arg2;
            this.max = arg1;
        }
    }

    public static void get() {
        System.out.println(min + " " + max);
    }
}
