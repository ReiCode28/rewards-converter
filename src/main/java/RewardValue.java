public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor for accepting cash value
    public RewardValue (double cashValue){
        setCashValue(cashValue);
    }
    // Constructor for accepting miles value
    public RewardValue (int milesValue){
        setMilesValue(milesValue);
    }

    // Returns the cash value
    public double getCashValue (){
        return cashValue;
    }

    // Returns the miles value
    public double getMilesValue(){
        return milesValue;
    }

    // Sets cash value
    public void setCashValue (double cashValue){
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Sets the miles value
    public void setMilesValue (int milesValue){
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // The private method that converts the miles value to cash
    private double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH_RATE;
    }

    // The private method that converts the cash value to miles
    private double convertToMiles(double cashValue){
        return cashValue / MILES_TO_CASH_RATE;
    }
}
