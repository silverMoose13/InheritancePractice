package inheritancepractice;

public class WaterAndFlyingTypePokemon extends Pokemon {

    private int level;
    private boolean battleStatus;
    private String opponentType;
    private int opponentLevel;
    private String winLikelihood;

    public String getWinLikelihood() {
        return winLikelihood;
    }

    public void setWinLikelihood(String winLikelihood) {
        this.winLikelihood = winLikelihood;
    }

    public int getOpponentLevel() {
        return opponentLevel;
    }

    public void setOpponentLevel(int opponentLevel) {
        this.opponentLevel = opponentLevel;
    }

    public String getOpponentType() {
        return opponentType;
    }

    public void setOpponant(String opponentType) {
        this.opponentType = opponentType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isBattleStatus() {
        return battleStatus;
    }

    public void setBattleStatus(boolean battleStatus) {
        this.battleStatus = battleStatus;
    }

    public String determineWinLikelihood() {
        if (getOpponentType().equalsIgnoreCase("Dragon")) {
            if (getLevel() > getOpponentLevel()) {
                setWinLikelihood("Will be a tough battle, but you should win");
            } else {
                setWinLikelihood("You probably won't win this one.");
            }
        } else if (getOpponentType().equalsIgnoreCase("Fire")) {
            if (getLevel() > getOpponentLevel()) {
                setWinLikelihood("This should be an easy one for you to win.");
            } else {
                setWinLikelihood("I would still try your luck despite being a lower level. This"
                        + "is probably a 50/50 outcome here.");
            }

        } else {
            setWinLikelihood("Hmm it appears I do not know enough information about your opponent.");
        }
        return getWinLikelihood();
    }
}
