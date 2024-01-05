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

    public int totalCredit(){
        int total = 0;
        for(int i = 0 ; i < getCurrentCoins().length; i++){
            int temp = 0;
            temp = this.getCurrentCoins()[i] * this.getValidCoins()[i];
            total += temp;
        }
        return total;
    }

    public boolean insert(int coin){
        boolean invalidCoin = true;
        for (int i = 0; i < getValidCoins().length; i++){
            if (coin == getValidCoins()[i]){
                invalidCoin = false;
            }
        }

        for(int i = 0; i < getValidCoins().length; i++){
            if (this.getValidCoins()[i] == coin){

                // add the coin in current coins
                int oldCur = this.getCurrentCoins()[i];
                this.getCurrentCoins()[i] = oldCur + 1;
                System.out.println(this.getValidCoins()[i] + " cent inserted!");

                // add the coin in inserted coins
                int oldIns = this.getInsertedCoins()[i];
                this.getInsertedCoins()[i] = oldIns + 1;
                return true;
            }
        }
        if(invalidCoin){
            System.out.println("Invalid coin: " + coin + " Could not be insert");
            System.out.println();
        }
        return false;
    }

    public boolean buy(int coin){
        System.out.println("Your current balance: " + coin);
        System.out.println("Bought!");

        // currentCoin -= price
        for (int i = 0; i < this.getCurrentCoins().length; i++){
            this.getCurrentCoins()[i] = 0;
        }
        return true;
    }

    // give all the coins back
    public void reset(){

        int currentCoins = 0;
        for(int i = 0; i < this.getCurrentCoins().length; i++){
            int temp = 0;

            // coin = 1
            if(i == 0){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 1 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 1 cent back!");
                    currentCoins += temp;
                }

            }

            // coin = 2
            else if(i == 1){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 2 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 2 cent back!");
                    currentCoins += temp;
                }
            }

            // coin = 5
            else if(i == 2){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 5 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 5 cent back!");
                    currentCoins += temp;
                }
            }

            // coin = 10
            else if(i == 3){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 10 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 10 cent back!");
                    currentCoins += temp;
                }
            }

            // coin = 20
            else if(i == 4){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 20 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 20 cent back!");
                    currentCoins += temp;
                }
            }

            // coin = 50
            else if(i == 5){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 50 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 50 cent back!");
                    currentCoins += temp;
                }
            }

            // coin = 100
            else if(i == 6){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 100 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 1 euro back!");
                    currentCoins += temp;
                }
            }

            // coin = 200
            else if(i == 7){
                if(this.getCurrentCoins()[i] == 0){
                    continue;
                }
                else {
                    temp = 200 * (this.getCurrentCoins()[i]);
                    System.out.println("Customer got " + this.getCurrentCoins()[i] + " pieces 2 euro back!");
                    currentCoins += temp;
                }
            }
            this.getCurrentCoins()[i] = 0 ;
        }
        System.out.println("Totally " + currentCoins + " cents has been given back!");
        System.out.println(" ");
    }
}
