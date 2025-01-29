public class SalesTaxCalculator {
    public static void main(String[] args) {
        State state = new State();
        if (args.length == 2) {
            if (args[0].equals("Indiana")) {
                state = new Indiana();
                state.setSalesTaxBehavior(new SevenPercent());
            }
            else if (args[0].equals("Alaska")) {
                state = new Alaska();
                state.setSalesTaxBehavior(new NoTax());
            }
            else if (args[0].equals("Hawaii")) {
                state = new Hawaii();
                state.setSalesTaxBehavior(new FourFivePercent());
            }
            else {
                System.out.println("Invalid state name.");
                System.exit(1);
            }
            state.showTax(Double.parseDouble(args[1]));
        }
        else System.out.println("Invalid number of arguments.");
    }
    
}
