package inheritancepractice;

public class Planet extends AstronomicalBody {

    private boolean hasPlanetaryRings;
    private boolean waterPresent;
    private String planetName;

    public boolean isWaterPresent() {
        return waterPresent;
    }

    public void setWaterPresent(boolean waterPresent) {
        this.waterPresent = waterPresent;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public boolean isHasPlanetaryRings() {
        return hasPlanetaryRings;
    }

    public void setHasPlanetaryRings(boolean hasPlanetaryRings) {
        this.hasPlanetaryRings = hasPlanetaryRings;
    }

    public String determinePlanetName() {
        if (isHasPlanetaryRings() == true && getColor().equalsIgnoreCase("Blue") && 
                isComposedOfPlasma() == false) {
            planetName = "Neptune";
            return planetName;
        } else if (isHasPlanetaryRings() == false && getColor().equalsIgnoreCase("Grey") && 
                isComposedOfPlasma() == false) {
            planetName = "Mercury";
            return planetName;
        } else {
            return "Unable to determine the planet's name.";
        }
    }

}
