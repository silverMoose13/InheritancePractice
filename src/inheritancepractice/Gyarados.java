package inheritancepractice;

public class Gyarados extends WaterAndFlyingTypePokemon {

    private boolean hydroPump;
    private boolean dragonPulse;
    private boolean hyperBeam;

    public boolean isHydroPump() {
        return hydroPump;
    }

    public void setHydroPump(boolean hydroPump) {
        this.hydroPump = hydroPump;
    }

    public boolean isDragonPulse() {
        return dragonPulse;
    }

    public void setDragonPulse(boolean dragonPulse) {
        this.dragonPulse = dragonPulse;
    }

    public boolean isHyperBeam() {
        return hyperBeam;
    }

    public void setHyperBeam(boolean hyperBeam) {
        this.hyperBeam = hyperBeam;
    }

    @Override
    public String determineWinLikelihood() {
        if (getOpponentType().equalsIgnoreCase("Dragon")) {
            if (getLevel() > getOpponentLevel()) {
                if (isHydroPump() == true && isHyperBeam() == true && isDragonPulse() == true) {
                    setWinLikelihood("Will be a tough battle, but you should win");
                } else {
                    setWinLikelihood("You don't know some of your best moves Gyarados so I don't know"
                            + "if you can take down a dragon-type Pokemon. You can certainly try though.");
                }
            } else {
                setWinLikelihood("You probably won't win this one.");
            }
        } else if (getOpponentType().equalsIgnoreCase("Fire")) {
            if (getLevel() > getOpponentLevel()) {
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
