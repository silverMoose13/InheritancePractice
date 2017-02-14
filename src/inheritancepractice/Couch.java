package inheritancepractice;

public class Couch extends Furnishing {

    private String couchType;
    private boolean freeDelivery;

    public String getCouchType() {
        return couchType;
    }

    public void setCouchType(String couchType) {
        this.couchType = couchType;
    }

    public boolean isFreeDelivery() {
        return freeDelivery;
    }

    public void setFreeDelivery(boolean freeDelivery) {
        this.freeDelivery = freeDelivery;
    }

    public boolean determineIfCouchQualifiesForFreeDelivery() {
        if (getCouchType().equalsIgnoreCase("Sectional")
                && determineNetCostPerItem() > 1000.00) {
            return true;
        } else {
            return false;
        }
    }

}
