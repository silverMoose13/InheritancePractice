package inheritancepractice;

public class Machine {

    private String materialComposition;
    private boolean functionalStatus;
    private int ageInYears;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getMaterialComposition() {
        return materialComposition;
    }

    public void setMaterialComposition(String materialComposition) {
        this.materialComposition = materialComposition;
    }

    public boolean isFunctionalStatus() {
        return functionalStatus;
    }

    public void setFunctionalStatus(boolean functionalStatus) {
        this.functionalStatus = functionalStatus;
    }

    public String determineIfWorthKeeping() {
        if (getAgeInYears() <= 10) {
            if (isFunctionalStatus() == true) {
                return "Still works and is relatively new. Keep it.";
            } else {
                return "Take it in for repair and if it is still broken trash it.";
            }
        } else {
            if (isFunctionalStatus() == true) {
                return "It may be older but it still works.";
            } else {
                return "It's time to get a new one.";
            }
        }
    }

}
