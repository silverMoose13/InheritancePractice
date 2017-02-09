package inheritancepractice;

public class Mars extends Planet {
    private boolean martian;
    private boolean lava;
    private boolean moltenRock;

    public boolean isMoltenRock() {
        return moltenRock;
    }

    public void setMoltenRock(boolean moltenRock) {
        this.moltenRock = moltenRock;
    }

    public boolean isLava() {
        return lava;
    }

    public void setLava(boolean lava) {
        this.lava = lava;
    }

    public boolean isMartian() {
        return martian;
    }

    public void setMartian(boolean martian) {
        this.martian = martian;
    }
    
    public boolean determineIfVolcanicActivityOccurred() {
        if ((isVolcanoPresent() == true && lava == true) || isMoltenRock() == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
