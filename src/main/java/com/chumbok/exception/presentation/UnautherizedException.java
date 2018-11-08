package com.chumbok.exception.presentation;


public class UnautherizedException extends RuntimeException implements PresentationException {

    public UnautherizedException(String message) {
        super(message);
    }

}
