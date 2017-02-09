package inheritancepractice;

public class Humanoid {

    private int heightInches;
    private int weightPounds;
    private String sizeComparison;

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public String compareHeightToHuman() {
        if (getHeightInches() > 80) {
            sizeComparison = "Taller than most humans.";
        } else if (getHeightInches() < 54) {
            sizeComparison = "Shorter than most humans.";
        }
        return sizeComparison;
    }

    public String compareWeightToHuman() {
        if (getWeightPounds() > 400) {
            sizeComparison = "Heavier than most humans.";
        } else if (getWeightPounds() < 50) {
            sizeComparison = "Lighter than most humans.";
        }
        return sizeComparison;
    }
}
