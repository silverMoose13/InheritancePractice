package inheritancepractice;

public class Decoration {

    private double grossPrice;
    private double discountPercentage;
    private double taxPercentage;
    private double heightInInches;
    private double lengthInInches;
    private double widthInInches;

    public double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(double grossPrice) {
        this.grossPrice = grossPrice;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(double lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public double getWidthInInches() {
        return widthInInches;
    }

    public void setWidthInInches(double widthInInches) {
        this.widthInInches = widthInInches;
    }

    public double calculateSurfaceArea() {
        return getHeightInInches() * getLengthInInches() * getWidthInInches();
    }

    public double determineNetCostPerItem() {
        double netCost;
        netCost = getGrossPrice() * (1 - (getTaxPercentage() - getDiscountPercentage()));
        return netCost;
    }

}
