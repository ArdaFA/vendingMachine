public class Muenzsystem {

    private final int[] validCoins = {1,2,5,10,20,50,100,200};

    // insertedCoins gibt an, wie viele der Münzen über alle Käufe eingeworfen worden sind.
    private int[] insertedCoins;

    // Das Array currentCoins soll angeben, wie viele der jeweiligen Münze vom Nutzer gerade eingeworfen wurden
    private int[] currentCoins;

    public Muenzsystem() {
        this.insertedCoins = new int[8];
        this.currentCoins = new int[8];
    }

    public int[] getValidCoins() {
        return validCoins;
    }

    public int[] getInsertedCoins() {
        return insertedCoins;
    }

    public void setInsertedCoins(int[] insertedCoins) {
        this.insertedCoins = insertedCoins;
    }

    public int[] getCurrentCoins() {
        return currentCoins;
    }

    public void setCurrentCoins(int[] currentCoins) {
        this.currentCoins = currentCoins;
    }

    public boolean insert(int inserted){
        return false;
    }

    public boolean buy(int bought){
        return false;
    }

    public void reset(){

    }
}
