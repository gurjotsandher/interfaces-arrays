package ca.bcit.comp1510.lab11;

public class Coin implements Lockable {
    
    // Coin attributes
    private final int HEAD_SIDE = 0;
    private final int TAIL_SIDE = 1;
    private int currentSide = HEAD_SIDE;
    
    // Lock attributes
    private int key = -1;
    private boolean isLocked = false;
    
    public Coin() throws LockException {
        flip();
    }
    
    public void flip() throws LockException {
        checkLockStatus();
        currentSide = (int)(Math.random() * 2);
    }
    
    public boolean isHeads() throws LockException {
        checkLockStatus();
        return currentSide == HEAD_SIDE;
    }
    
    public String toString() {
        return isHeads() ? "Coin(Heads)" : "Coin(Tails)";
    }
    
    public void checkLockStatus() throws LockException {
        if (isLocked) {
            throw new LockException("The calling object is currently locked and "
                    + "cannot perform the requested functionality.");
        }
    }
    
    public void setKey(int keyNum) {
        key = keyNum;
    }
    
    public boolean lock(int keyNum) {
        if (key == keyNum) {
            isLocked = true;
        }
        return isLocked;
    }
    
    public boolean unlock(int keyNum) {
        if (key == keyNum) {
            isLocked = false;
        }
        return isLocked;
    }
    
    public boolean locked() {
        return isLocked;
    }
}
