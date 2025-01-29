public class FourFivePercent implements SalesTaxBehavior{
    public Double compute(Double value){
        return value * .045; // calculate 4.5% of the value
    }
}
