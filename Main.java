import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Muenzsystem ms = new Muenzsystem();
    Ware water = new Ware(1, "Water", 150);
    Ware sWater = new Ware(2, "Sparkling Water", 150);
    Ware redbull = new Ware(3, "Redbull", 200);
    Ware cola = new Ware(4, "Coca-Cola", 200);
    Ware chips = new Ware(5, "Lay's", 250);
    Ware peanut = new Ware(6, "Mix-Nuts", 125);
    Ware sand = new Ware(7, "Chicken Sandwich", 350);
    Ware[] wares = {
            water,
            sWater,
            cola,
            redbull,
            chips,
            peanut,
            sand
    };

    Automat atm = new Automat(ms, wares);

    atm.printWare();


    boolean shouldStop = false;
    while(!shouldStop){
        System.out.println("Your credit: " + atm.getMs().totalCredit() + " cents");
        System.out.print("""
            1 to insert coin
            2 to choose item\s
            3 to reset\s
            4 to quit\s
            \s
            your input: """);
        int choose;
        choose = scanner.nextInt();
        if (choose == 1){
            boolean stopInsert = false;
            while (!stopInsert){
                int coin;
                System.out.print("Give the coin or 0 to finish inserting: ");
                coin = scanner.nextInt();
                if(coin == 0){
                    System.out.println(" ");
                    stopInsert = true;
                }
                else {
                    atm.insertCoin(coin);
                }
            }

        } else if (choose == 2) {
            atm.printWare();
            System.out.println(" ");
            int userSelection;
            System.out.print("Select the product: ");
            userSelection = scanner.nextInt();
            atm.select(userSelection);
        } else if (choose == 3) {
            atm.abort();
        } else if (choose == 4) {
            System.out.println("Quitting...");
            shouldStop = true;
        }
        else {
            System.out.print("Invalid. Again: ");
        }
    }
//    atm.insertCoin(200);
//    atm.insertCoin(300);
//    atm.select(1);

    }
}