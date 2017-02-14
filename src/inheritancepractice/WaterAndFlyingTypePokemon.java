package inheritancepractice;

public class WaterAndFlyingTypePokemon extends Pokemon {

    private boolean learnedHydroPump;
    private boolean fullyEvolved;

    public boolean isFullyEvolved() {
        return fullyEvolved;
    }

    public void setFullyEvolved(boolean fullyEvolved) {
        this.fullyEvolved = fullyEvolved;
    }

    public boolean isLearnedHydroPump() {
        return learnedHydroPump;
    }

    public void setLearnedHydroPump(boolean learnedHydroPump) {
        this.learnedHydroPump = learnedHydroPump;
    }

    @Override
    public String determineWinLikelihood() {
        if (getOpponentType().equalsIgnoreCase("Electric")) {
            if (getExperienceLevel() > getOpponentLevel()
                    && isFullyEvolved() == true
                    && isLearnedHydroPump() == true) {
                setWinLikelihood("Will be a tough battle, but you should win");
            } else {
                setWinLikelihood("You probably won't win this one.");
            }
        } else if (getOpponentType().equalsIgnoreCase("Fire")) {
            if (getExperienceLevel() > getOpponentLevel()) {
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
