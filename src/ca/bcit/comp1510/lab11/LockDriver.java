package ca.bcit.comp1510.lab11;

public class LockDriver {
    
    public static void main(String[] args) {
        Coin testCoin = new Coin();
        testCoin.setKey(1);
        // test locking then using functionality while locked
        testCoin.lock(1);
        System.out.println("After locking, locked() returns: " + testCoin.locked());
        // LockException should be raised here
        try {
            testCoin.flip();
        }
        catch(LockException lockErr) {
            System.out.println(lockErr);
        }
        // unlock, test status, then test locking / unlocking
        // with new key
        testCoin.unlock(1);
        System.out.println("After unlocking, locked() returns: " + testCoin.locked());
        testCoin.lock(2);
        testCoin.unlock(2);
        // finally, try using permitted functionality:
        // (should work without exception)
        testCoin.flip();
        System.out.println("Unlocked flip() succeeded");
    }
}