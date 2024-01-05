public class Main {
    public static void main(String[] args) {

    Muenzsystem ms = new Muenzsystem();
    Ware book = new Ware(1, "Book", 350);
    Ware[] wares = {
            book
    };

    Automat atm = new Automat(ms, wares);

    atm.printWare();
    atm.select(1);

    }
}