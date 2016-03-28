package com.evansitzes;

public class HelloWorld {
	private String message;
	
	public void setMessage(final String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your message: " + message);
	}

    public void init() {
        System.out.println("Initializing bean...");
    }

    public void destroy() {
        System.out.println("Destroying bean...");
    }
}
