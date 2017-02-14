package inheritancepractice;

public class Hobbit extends Humanoid {

    private String middleEarthHomeLocation;
    private boolean liveInSmial;

    public boolean isLiveInSmial() {
        return liveInSmial;
    }

    public void setLiveInSmial(boolean liveInSmial) {
        this.liveInSmial = liveInSmial;
    }

    public String getMiddleEarthHomeLocation() {
        return middleEarthHomeLocation;
    }

    public void setMiddleEarthHomeLocation(String middleEarthHomeLocation) {
        this.middleEarthHomeLocation = middleEarthHomeLocation;
    }

    public boolean determineIfTrueHobbit() {
        if ((getMiddleEarthHomeLocation().equalsIgnoreCase("The Shire") ||
                getMiddleEarthHomeLocation().equalsIgnoreCase("Bree") ||
                getMiddleEarthHomeLocation().equalsIgnoreCase("Valley of Anduin")) 
                && isWalksBarefoot() == true
                && compareHeightToHuman().matches("Shorter than most humans.")
                && compareWeightToHuman().matches("Lighter than most humans.")) {
            return true;
        } else {
            return false;
        }
    }

}
