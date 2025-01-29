public class State {
    private String name;
    private SalesTaxBehavior salesTaxBehavior;
    public State(){
        setName("Generic State");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void showTax(double value) { // print formatted string to show original price, state name, and amount of tax
        System.out.println("The sales tax on $" + String.format("%.2f",value) + " in " + this.getName() + " is $" + String.format("%.2f",getSalesTaxBehavior().compute(value)) + ".");
    }
    public void setSalesTaxBehavior(SalesTaxBehavior behavior) {
        this.salesTaxBehavior = behavior;
    }
    public SalesTaxBehavior getSalesTaxBehavior() {
        return this.salesTaxBehavior;
    }
}
