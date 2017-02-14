package inheritancepractice;

public class Mars extends Planet {

    private String volcanoName;
    private boolean lavaFlowing;
    private boolean moltenRockPresent;

    public String getVolcanoName() {
        return volcanoName;
    }

    public void setVolcanoName(String volcanoName) {
        this.volcanoName = volcanoName;
    }

    public boolean isMoltenRockPresent() {
        return moltenRockPresent;
    }

    public void setMoltenRockPresent(boolean moltenRockPresent) {
        this.moltenRockPresent = moltenRockPresent;
    }

    public boolean isLavaFlowing() {
        return lavaFlowing;
    }

    public void setLavaFlowing(boolean lava) {
        this.lavaFlowing = lava;
    }

    public boolean determineIfVolcanicActivityOccurredOnMars() {
        if ((lavaFlowing == true) || isMoltenRockPresent() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean determineIfLifePotentiallyExistsOnMars() {
        if (isWaterPresent() == true) {
            return true;
        } else {
            return false;
        }
    }
}
