package org.java.interface4;

public interface Interface1 {
    void launchBrowser();
    void quiteBrowser();

    void closeBrowser();
    void get();
    void getTitle();

//    instance way
    default void getURL() {
        System.out.println("inside getURL method");
    }

//    Static way
    static void navigate() {
        System.out.println("Navigating to url from interface");
    }
}
