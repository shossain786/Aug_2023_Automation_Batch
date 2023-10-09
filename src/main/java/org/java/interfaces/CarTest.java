package org.java.interfaces;

import org.testng.annotations.Test;

public class CarTest {
    @Test
    public void suzukiVitaraTest() {
        System.out.println("Running test: SuzukiVitaraTest");
        SuzukiVitara suzukiVitara = new SuzukiVitara();
        suzukiVitara.start();
        suzukiVitara.run();
        suzukiVitara.stop();
        suzukiVitara.hornModel();
        suzukiVitara.speedWarning(90);
        System.out.println("===================================================");
    }

    @Test
    public void tataNexonTest() {
        System.out.println("Running test: tataNexonTest");
        TataNexon tataNexon = new TataNexon();
        tataNexon.start();
        tataNexon.run();
        tataNexon.stop();
        tataNexon.hornModel();
        tataNexon.speedWarning(110);
        System.out.println("===================================================");
    }
}
