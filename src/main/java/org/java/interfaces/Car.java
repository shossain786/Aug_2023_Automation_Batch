package org.java.interfaces;

public interface Car {
    void start();
    void run();
    void stop();
    default void speedWarning(int speed){
        if (speed > 80 && speed < 100) {
            System.out.println("Warning! You are running on risk! Please be focused on driving only!!");
            return;
        }
        if (speed >= 100) {
            System.out.println("Warning!! You are running on over speed. Please control down the speed!");
        }
    }
}
