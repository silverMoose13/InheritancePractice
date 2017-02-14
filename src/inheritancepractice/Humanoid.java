package inheritancepractice;

public class Humanoid {

    private int heightInches;
    private int weightPounds;
    private boolean walksBarefoot;
    private String nextAdventureLocation;

    public String getNextAdventureLocation() {
        return nextAdventureLocation;
    }

    public void setNextAdventureLocation(String nextAdventureLocation) {
        this.nextAdventureLocation = nextAdventureLocation;
    }

    public boolean isWalksBarefoot() {
        return walksBarefoot;
    }

    public void setWalksBarefoot(boolean walksBarefoot) {
        this.walksBarefoot = walksBarefoot;
    }

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
        String heightComparison = "";
        if (getHeightInches() > 80) {
            heightComparison = "Taller than most humans.";
        } else if (getHeightInches() < 54) {
            heightComparison = "Shorter than most humans.";
        }
        return heightComparison;
    }

    public String compareWeightToHuman() {
        String weightComparison = "";
        if (getWeightPounds() > 400) {
            weightComparison = "Heavier than most humans.";
        } else if (getWeightPounds() < 50) {
            weightComparison = "Lighter than most humans.";
        }
        return weightComparison;
    }
}
