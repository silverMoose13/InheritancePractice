package inheritancepractice;

public class SerpentineMonster extends Creature {

    private String strategicBattleAbility;
    private String lairLocation;
    private String enemy;

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getLairLocation() {
        return lairLocation;
    }

    public void setLairLocation(String lairLocation) {
        this.lairLocation = lairLocation;
    }

    public String getStrategicBattleAbility() {
        return strategicBattleAbility;
    }

    public void setStrategicBattleAbility(String strategicBattleAbility) {
        this.strategicBattleAbility = strategicBattleAbility;
    }

    @Override
    public boolean determineIfAbleToSwim() {
        if (getStrategicBattleAbility().equalsIgnoreCase("Swim Ability")) {
            return true;
        } else if (isScales() == true && isTail() == true && isFins() == true) {
            return true;
        } else {
            return false;
        }
    }

}
