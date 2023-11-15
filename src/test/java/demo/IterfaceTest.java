package demo;

import org.java.interfacedemo.SuzukiMaruti;
import org.java.interfacedemo.TataSumo;

public class IterfaceTest {
    public static void main(String[] args) {
        TataSumo tataSumo = new TataSumo();
        tataSumo.move();
        tataSumo.makeSound();

        SuzukiMaruti suzukiMaruti = new SuzukiMaruti();
        suzukiMaruti.move();
        suzukiMaruti.makeSound();
    }
}
