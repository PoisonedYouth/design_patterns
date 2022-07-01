package singleton;

class Singleton{
    private int counter = 0;
    private volatile Singleton instance;

    private Singleton(){
        // Prevent instantiation
    }

    Singleton getInstance(){
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    int getNextInt(){
        return counter++;
    }
}
