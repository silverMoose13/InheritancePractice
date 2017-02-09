package inheritancepractice;

public class Hydra extends Monster {

    private String weakness;
    private int numberOfHeads;
    private boolean enemyNearby;
    private int damageDealt;

    public boolean isEnemyNearby() {
        return enemyNearby;
    }

    public void setEnemyNearby(boolean enemyNearby) {
        this.enemyNearby = enemyNearby;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
    }

    public int useSecretAbility() {
        if (isEnemyNearby() == true
                && getSpecialAbility().equalsIgnoreCase("Poisonous Breath")) {
            if (getNumberOfHeads() <= 6 && getNumberOfHeads() >= 1) {
                damageDealt = 15;
                return damageDealt;
            } else if (getNumberOfHeads() > 6) {
                damageDealt = 25;
                return damageDealt;
            } else {
                damageDealt = 0;
                return damageDealt;
            }
        } else {
            damageDealt = 0;
            return damageDealt;
        }
    }
}
