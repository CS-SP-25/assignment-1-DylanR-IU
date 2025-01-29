public class NoTax implements SalesTaxBehavior {
    public Double compute(Double value) {
        return 0.0; // return 0 since there's no tax
    }
}
