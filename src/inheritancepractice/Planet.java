package inheritancepractice;

public class Planet extends AstronomicalBody {

    private int diameter;
    private double strengthOfGravity;
    private String color;
    private boolean hasRings;
    private String planetName;
    private boolean volcanoPresent;

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public boolean isVolcanoPresent() {
        return volcanoPresent;
    }

    public void setVolcanoPresent(boolean volcanoPresent) {
        this.volcanoPresent = volcanoPresent;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getStrengthOfGravity() {
        return strengthOfGravity;
    }

    public void setStrengthOfGravity(double strengthOfGravity) {
        this.strengthOfGravity = strengthOfGravity;
    }

    public String determinePlanetName() {
        if (isHasRings() == true && getColor().equalsIgnoreCase("Blue") && 
                isHasPlasma() == false) {
            planetName = "Neptune";
            return planetName;
        } else if (isHasRings() == false && getColor().equalsIgnoreCase("Grey") && 
                isHasPlasma() == false) {
            planetName = "Mercury";
            return planetName;
        } else {
            return "Unable to determine the planet's name.";
        }
    }

}
