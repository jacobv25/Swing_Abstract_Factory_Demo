import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        int value = 0;
        SelectionPanelFactoryIF factory = new SelectionPanelFactory();

        System.out.println("PUSH 0 for beginner,\n1 for intermediate,\n2 for advance");

        input = scanner.next();

//        value =

        while (input != "0" || input != "1" || input != "2") {
            System.out.println("Incorrect answer! Please answer 0, 1 or 2");
            input = scanner.next();
        }


    }
}
