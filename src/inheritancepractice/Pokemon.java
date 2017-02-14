package inheritancepractice;

public class Pokemon {

    private String type;
    private int experienceLevel;
    private boolean rechargedForBattle;
    private String opponentType;
    private int opponentLevel;
    private String winLikelihood;

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public boolean isRechargedForBattle() {
        return rechargedForBattle;
    }

    public void setRechargedForBattle(boolean rechargedForBattle) {
        this.rechargedForBattle = rechargedForBattle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public String determineTypeWeakness() {
        String weakness;

        switch (type) {
            case "Grass":
                weakness = "Fire";
                break;
            case "Water":
                weakness = "Electric";
                break;
            case "Fire":
                weakness = "Water";
                break;
            case "Ground":
                weakness = "Water";
                break;
            case "Dragon":
                weakness = "Dragon";
            default:
                weakness = "Unknown based on supplied data";
        }
        return weakness;
    }

    public String determineWinLikelihood() {
            if (getExperienceLevel() > getOpponentLevel()) {
                setWinLikelihood("Will be a tough battle, but you should win");
            } else {
                setWinLikelihood("You probably won't win this one.");
            }
        return getWinLikelihood();
    }

}
