package ca.bcit.comp1510.lab11;

/*
 * LockException | Author: Gurjot Sandher
 * */

public class LockException extends RuntimeException {
    public LockException(String prompt) {
        super(prompt);
    }
}
