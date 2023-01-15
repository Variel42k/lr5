package lr5;

public class Example2 {
    public static char field_0 = 'A';
    public static char field_1 = 'Y';

    public static void main(String[] args) {
        fst();
    }

    public static void fst() {
        int ammount = Character.getNumericValue(field_1) - Character.getNumericValue(field_0);
        for (int i = 0; i <= ammount; i++) {
            System.out.print((char) (i+(int)(field_0)));
        }
    }
}
