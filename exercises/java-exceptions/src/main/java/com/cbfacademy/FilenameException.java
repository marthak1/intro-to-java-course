package com.cbfacademy;

public class FilenameException extends Exception {
    private final String message;

    public FilenameException(String message) {
        this.message = message;

    }

    @Override
    public String getMessage() {
        return String.join(" - ", super.getMessage(), this.message);
    }
}