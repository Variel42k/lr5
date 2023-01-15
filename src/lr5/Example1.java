package lr5;

import java.util.Scanner;

public class Example1 {
    private static char field_1;

    public static void main(String[] args) {
        inputField();
    }

    @SuppressWarnings("resource")
    public static void inputField() {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String variable_0 = inCMD.nextLine();
        if (variable_0.isEmpty()) {
            System.out.println("Символ не распознан");
            return;
        }
        field_1 = variable_0.charAt(0);
        inCMD.close();
        outputID();
        outputFull();
    }

    public static int outputID() {
        char variable_1 = field_1;
        System.out.println("Код символа в поле: " + (int) variable_1);
        return (int) variable_1;
    }

    public static void outputFull() {
        System.out.printf("Код символа %s - %d", field_1, outputID());
    }
}
