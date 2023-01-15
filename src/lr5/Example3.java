package lr5;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(new input3());
        input3.get();
        System.out.println(new input3(1));
        input3.get();
        System.out.println(new input3(1, 2));
        input3.get();
        System.out.println(new input3(new input3(2)));
        input3.get();
    }

}

@SuppressWarnings("static-access")
class input3 {
    static int field_0;
    static int field_1;

    input3() {
        this.field_0 = 0;
        this.field_1 = 1;
    }

    input3(int a) {
        this.field_0 = 0+a;
        this.field_1 = 1+a;
    }

    input3(int a, int b) {
        this.field_0 = 0*a;
        this.field_1 = 1*b;
    }

    input3(input3 t){
        this.field_0 = t.field_0+1;
        this.field_1 = t.field_1+2;
    }

    public static void get() {
        System.out.println(field_0);
        System.out.println(field_1);
    }
}
