package inheritancepractice;

public class BilboBaggins extends Hobbit {

    private int daysSinceLastAdventure;
    private boolean magicRingInPossession;
    private boolean stingSharpened;

    public boolean isMagicRingInPossession() {
        return magicRingInPossession;
    }

    public void setMagicRingInPossession(boolean magicRingInPossession) {
        this.magicRingInPossession = magicRingInPossession;
    }

    public boolean isStingSharpened() {
        return stingSharpened;
    }

    public void setStingSharpened(boolean stingSharpened) {
        this.stingSharpened = stingSharpened;
    }

    public int getDaysSinceLastAdventure() {
        return daysSinceLastAdventure;
    }

    public void setDaysSinceLastAdventure(int daysSinceLastAdventure) {
        this.daysSinceLastAdventure = daysSinceLastAdventure;
    }

    public boolean readyForNextAdventure() {
        if (getDaysSinceLastAdventure() < 21) {
            return false;
        } else {
            if (getNextAdventureLocation().equalsIgnoreCase("Mordor")
                    && isMagicRingInPossession() == true
                    && isStingSharpened() == true) {
                return true;
            } else {
                return false;
            }
        }
    }
}
