package com.chumbok.exception.presentation;


public class InternalErrorException extends RuntimeException implements PresentationException {

    public InternalErrorException(String message) {
        super(message);
    }

}
