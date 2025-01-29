public class SevenPercent implements SalesTaxBehavior{
    public Double compute(Double value){
        return value * .07; // calculate 7% of the value
    }
}
