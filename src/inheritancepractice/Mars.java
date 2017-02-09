package inheritancepractice;

public class Mars extends Planet {
    private String volcanoName = "Olympus Mons";
    private boolean martian;
    private boolean lava;

    public boolean isLava() {
        return lava;
    }

    public void setLava(boolean lava) {
        this.lava = lava;
    }

    public String getVolcanoName() {
        return volcanoName;
    }

    public void setVolcanoName(String volcanoName) {
        this.volcanoName = volcanoName;
    }

    public boolean isMartian() {
        return martian;
    }

    public void setMartian(boolean martian) {
        this.martian = martian;
    }
    
    public boolean hasVolcanoErupted() {
        if (lava == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
