package inheritancepractice;

public class BilboBaggins extends Hobbit {

    private int age;
    private int levelOfFatigue;
    private boolean feelingAdventurous;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevelOfFatigue() {
        return levelOfFatigue;
    }

    public void setLevelOfFatigue(int levelOfFatigue) {
        this.levelOfFatigue = levelOfFatigue;
    }

    public boolean isFeelingAdventurous() {
        return feelingAdventurous;
    }

    public void setFeelingAdventurous(boolean feelingAdventurous) {
        this.feelingAdventurous = feelingAdventurous;
    }

    public String determineIfBilboShouldGoOnAdventure() {
        if (getLevelOfFatigue() > 6 && getLevelOfFatigue() <= 10) {
            if (isFeelingAdventurous() == true) {
                return "Bilbo is tired, but is ready for another adventure!";
            } else if (isHadSecondBreakfast() == true) {
                return "Bilbo had second breakfast and is ready to go on an adventure.";
            } else {
                return "Bilbo is not ready for an adventure.";
            }
        } else {
            return "Maybe tomorrow. Bilbo is not ready to go on an adventure today.";
        }
    }

}
