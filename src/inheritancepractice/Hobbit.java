package inheritancepractice;

public class Hobbit extends Humanoid {

    private boolean wearsHumanesqueClothes;
    private boolean walksBarefoot;
    private boolean hadSecondBreakfast;

    public boolean isHadSecondBreakfast() {
        return hadSecondBreakfast;
    }

    public void setHadSecondBreakfast(boolean hadSecondBreakfast) {
        this.hadSecondBreakfast = hadSecondBreakfast;
    }

    public boolean isWearsHumanesqueClothes() {
        return wearsHumanesqueClothes;
    }

    public void setWearsHumanesqueClothes(boolean wearsHumanesqueClothes) {
        this.wearsHumanesqueClothes = wearsHumanesqueClothes;
    }

    public boolean isWalksBarefoot() {
        return walksBarefoot;
    }

    public void setBarefoot(boolean barefoot) {
        this.walksBarefoot = barefoot;
    }

    public boolean determineIfTrueHobbit() {
        if (isWalksBarefoot() == true && isWearsHumanesqueClothes() == true
                && compareHeightToHuman().matches("Shorter than most humans.")
                && compareWeightToHuman().matches("Lighter than most humans.")) {
            return true;
        } else {
            return false;
        }
    }

}
