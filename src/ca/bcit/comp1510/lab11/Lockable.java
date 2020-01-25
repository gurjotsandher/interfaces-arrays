package ca.bcit.comp1510.lab11;

public interface Lockable {
    
    /*
     * Set initial lock key to control access to functionality
     * */
    void setKey(int key);
    
    /*
     * Restrict an object's access to functionality by 'locking' with the
     * provided key. Returns true on successful lock completion
     * */
    boolean lock(int key);
    
    /*
     * Free an object's access to functionality by 'unlocking' with
     * the provided key. Returns true on successful unlock completion
     * */
    boolean unlock(int key);
    
    /*
     * Return the using object's locked status
     * */
    boolean locked();
    
}
