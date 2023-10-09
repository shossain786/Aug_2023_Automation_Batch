package org.java.advanceswitch;

public class SwitchCaseTest {
    public static void main(String[] args) {
        setAlarm("Wednesday");
    }

    static void setAlarm1(String day) {
//        switch with return value supported by java 17
        String time;
/*        time = switch(day) {

        }*/
    }
//    Traditional switch-case
    static void setAlarm(String day) {
        switch (day) {
            case "Sunday":
            case "Saturday":
                System.out.println("Alarm set at: 8AM");
                break;
            case "Monday":
                System.out.println("Alarm set at: 7AM");
                break;
            default:
                System.out.println("Alarm set at 6AM");
        }
    }
}
/*
    earlier java5 we can use only int in switch.
    From Java 5 we got String in Switch

*/

