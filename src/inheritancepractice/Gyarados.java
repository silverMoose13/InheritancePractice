package inheritancepractice;

public class Gyarados extends WaterAndFlyingTypePokemon {

    private boolean learnedIntimidate;
    private boolean learnedMoxie;
    private boolean learnedMoldBreaker;

    public boolean isLearnedIntimidate() {
        return learnedIntimidate;
    }

    public void setLearnedIntimidate(boolean learnedIntimidate) {
        this.learnedIntimidate = learnedIntimidate;
    }

    public boolean isLearnedMoxie() {
        return learnedMoxie;
    }

    public void setLearnedMoxie(boolean learnedMoxie) {
        this.learnedMoxie = learnedMoxie;
    }

    public boolean isLearnedMoldBreaker() {
        return learnedMoldBreaker;
    }

    public void setLearnedMoldBreaker(boolean learnedMoldBreaker) {
        this.learnedMoldBreaker = learnedMoldBreaker;
    }

    @Override
    public String determineWinLikelihood() {
        if (getOpponentType().equalsIgnoreCase("Dragon")) {
            if (getExperienceLevel() > getOpponentLevel()) {
                if (isLearnedIntimidate() == true && isLearnedMoldBreaker() == true && isLearnedMoxie() == true) {
                    setWinLikelihood("Will be a tough battle, but you should win");
                } else {
                    setWinLikelihood("You don't know some of your best moves Gyarados so I don't know"
                            + "if you can take down a dragon-type Pokemon. You can certainly try though.");
                }
            } else {
                setWinLikelihood("You probably won't win this one.");
            }
        } else if (getOpponentType().equalsIgnoreCase("Fire")) {
            if (getExperienceLevel() > getOpponentLevel()) {
                setWinLikelihood("This should be an easy one for you to win Gyarados.");
            } else {
                setWinLikelihood("Given you are part water-type, it doesn't matter you are a lower"
                        + "level than your fire-type opponent.");
            }
        } else {
            setWinLikelihood("Hmm it appears I do not know enough information about your opponent.");
        }
        return getWinLikelihood();
    }

}
