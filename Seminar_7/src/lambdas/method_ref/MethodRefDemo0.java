package lambdas.method_ref;

import javax.swing.*;

public class MethodRefDemo0 {
    public static void main(String[] args) {
//        ActionListener actionListener = System.out::println;
//        System.out.println("actionListener = " + actionListener);
//        enums.ReflectionTest.printClassInfo(actionListener.getClass());

        new Timer(1000, System.out::println).start();
//        while (true);
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
