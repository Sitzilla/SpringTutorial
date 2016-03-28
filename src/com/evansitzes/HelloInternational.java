package com.evansitzes;

/**
 * Created by evan on 3/28/16.
 */
public class HelloInternational {
    private String message1;
    private String message2;

    public void getMessage1() {
        System.out.println("International message1: " + message1);
    }

    public void setMessage1(String message) {
        this.message1 = message;
    }

    public void getMessage2() {
        System.out.println("International message2: " + message2);
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }
}
