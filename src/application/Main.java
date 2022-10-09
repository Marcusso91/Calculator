package application;

import java.util.*;
import com.jtattoo.plaf.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            Calculator c = new Calculator();

        } catch (ClassNotFoundException ce) {
            System.out.println(ce.getMessage());
        } catch (InstantiationException ie) {
            System.out.println(ie.getMessage());
        } catch (IllegalAccessException iae) {
            System.out.println(iae);
        } catch (UnsupportedLookAndFeelException ue) {
            System.out.println(ue);
        }

    }
}
