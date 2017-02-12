package inheritancepractice;

public class Furnishing extends TangibleGood {

    private String designPattern;
    private String materialType;

    public String getDesignPattern() {
        return designPattern;
    }

    public void setDesignPattern(String designPattern) {
        this.designPattern = designPattern;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public boolean isThisStylish() {
        if ((getColor().equalsIgnoreCase("Orange") || getColor().equalsIgnoreCase("Purple"))
                && getDesignPattern().equalsIgnoreCase("Striped")) {
            return true;
        } else if (getColor().equalsIgnoreCase("Blue") && getMaterialType().equalsIgnoreCase("Suede")) {
            return true;
        } else {
            return false;
        }
    }

}