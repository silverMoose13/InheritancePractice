package inheritancepractice;

public class Monster extends Creature {

    private boolean claws;
    private String specialAbility;

    public boolean isClaws() {
        return claws;
    }

    public void setClaws(boolean claws) {
        this.claws = claws;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    @Override
    public boolean determineIfAbleToSwim() {
        if (getSpecialAbility().equalsIgnoreCase("Swim Ability")) {
            return true;
        } else if (isScales() == true && isTail() == true && isFins() == true) {
            return true;
        } else {
            return false;
        }
    }

}
