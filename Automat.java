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
        System.out.println("****************************");
        for(int i = 0 ; i < this.getWares().length; i++){
            System.out.println("ID: " + this.getWares()[i].getID() + ", Name: " + this.getWares()[i].getName() + ", Price: " + this.getWares()[i].getPrice());
        }
        System.out.println("****************************");
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
            this.getMs().buy(currentCoins);
            return true;
        }
        else{
            System.out.println("You do not have enough credits to buy " + selectedWare.getName());
            return false;
        }

    }

    public boolean insertCoin(int coin){
        return this.getMs().insert(coin);
    }

    // do cancel
    public void abort(){
        this.getMs().reset();
    }

}
