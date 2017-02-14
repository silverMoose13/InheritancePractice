package inheritancepractice;

public class LernaeanHydra extends SerpentineMonster {

    private boolean multipleHeadsIntact;
    private boolean poisonousBreathAttackCharged;
    private boolean dualEnemy;

    public boolean isPoisonousBreathAttackCharged() {
        return poisonousBreathAttackCharged;
    }

    public void setPoisonousBreathAttackCharged(boolean poisonousBreathAttackCharged) {
        this.poisonousBreathAttackCharged = poisonousBreathAttackCharged;
    }

    public boolean isDualEnemy() {
        return dualEnemy;
    }

    public void setDualEnemy(boolean dualEnemy) {
        this.dualEnemy = dualEnemy;
    }

    public boolean isMultipleHeadsIntact() {
        return multipleHeadsIntact;
    }

    public void setMultipleHeadsIntact(boolean multipleHeadsIntact) {
        this.multipleHeadsIntact = multipleHeadsIntact;
    }

    public boolean dualOrFleeEnemy() {
        if (getEnemy().equalsIgnoreCase("Hercules")) {
            if (multipleHeadsIntact && isPoisonousBreathAttackCharged() == true) {
                dualEnemy = true;
            } else {
                dualEnemy = false;
            }
        } else {
            dualEnemy = true;
        }
        return dualEnemy;
    }
}
