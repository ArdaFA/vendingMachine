public class Automat {

    private Muenzsystem ms;
    private Ware[] wares;

    public Automat(Muenzsystem ms, Ware[] wares) {
        this.ms = ms;
        this.wares = wares;
    }

    public Muenzsystem getMs() {
        return ms;
    }

    public void setMs(Muenzsystem ms) {
        this.ms = ms;
    }

    public Ware[] getWares() {
        return wares;
    }

    public void setWares(Ware[] wares) {
        this.wares = wares;
    }

    // Ware Information
    public void printWare(){
        for(int i = 0 ; i < this.getWares().length; i++){
            System.out.println("ID: " + this.getWares()[i].getID() + ", Name: " + this.getWares()[i].getName() + ", Price: " + this.getWares()[i].getPrice());
        }
    }

    // versucht dann die Ware mit der ID des übergebenen Wertes zu kaufen
    public boolean select(int select){
        Ware selectedWare = new Ware(0, " ", 0);
        for (int i = 0; i < this.getWares().length; i++){
            if(this.getWares()[i].getID() == select){
                selectedWare = this.getWares()[i];
            }
        }
        System.out.println("User selected the item: " + selectedWare.getName());
        System.out.println("It costs " + selectedWare.getPrice());
        // currentCoin = price
        int currentCoins = 0;
        for (int i = 0; i < this.getMs().getCurrentCoins().length; i++){
            int temp = 0;

            // coin = 1
            if(i == 0){
                temp = 1 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }

            // coin = 2
            else if(i == 1){
                temp = 2 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }

            // coin = 5
            else if(i == 2){
                temp = 5 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }

            // coin = 10
            else if(i == 3){
                temp = 10 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }

            // coin = 20
            else if(i == 4){
                temp = 20 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }

            // coin = 50
            else if(i == 5){
                temp = 50 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }

            // coin = 100
            else if(i == 6){
                temp = 100 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }

            // coin = 200
            else if(i == 7){
                temp = 200 * (this.getMs().getCurrentCoins()[i]);
                currentCoins += temp;
            }
        }

        int selectedPrice = selectedWare.getPrice();
        if(selectedPrice <= currentCoins){
            // buys
            System.out.println("Customer has enough money to buy it.");
            System.out.println("Bought!");


            // currentCoin -= price
            for (int i = 0; i < this.getMs().getCurrentCoins().length; i++){
                this.getMs().getCurrentCoins()[i] = 0;
            }
            return true;
        }
        else{
            System.out.println("Customer do not have enough money to pay");
            return false;
        }



    }

    public boolean insertCoin(int coin){
        // check if the coin is valid
        for(int i = 0; i < this.getMs().getValidCoins().length; i++){
            // yes, the coin is valid
            if(this.getMs().getValidCoins()[i] == coin){
                // add the coin in current coins
                int oldCur = this.getMs().getCurrentCoins()[i];
                this.getMs().getCurrentCoins()[i] = oldCur + 1;

                // add the coin in inserted coins
                int oldIns = this.getMs().getInsertedCoins()[i];
                this.getMs().getInsertedCoins()[i] = oldCur + 1;

                return true;
            }
        }
        return false;
    }

    // do cancel
    public void abort(){

        for(int i = 0; i < this.getMs().getCurrentCoins().length; i++){

            // coin = 1
            if(i == 0){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 1 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }

            // coin = 2
            else if(i == 1){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 2 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }

            // coin = 5
            else if(i == 2){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 5 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }

            // coin = 10
            else if(i == 3){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 10 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }

            // coin = 20
            else if(i == 4){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 20 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }

            // coin = 50
            else if(i == 5){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 50 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }

            // coin = 100
            else if(i == 6){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 100 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }

            // coin = 200
            else if(i == 7){
                System.out.println("Customer got " + this.getMs().getCurrentCoins()[i] + " pieces 200 cent back!");
                this.getMs().getCurrentCoins()[i] = 0;
            }
        }
    }




}
