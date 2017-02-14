package inheritancepractice;

public class AstronomicalBody {

    private int mass;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private boolean composedOfPlasma;
    private boolean composedOfHydrogen;
    private boolean composedOfHelium;

    public boolean isComposedOfHydrogen() {
        return composedOfHydrogen;
    }

    public void setComposedOfHydrogen(boolean composedOfHydrogen) {
        this.composedOfHydrogen = composedOfHydrogen;
    }

    public boolean isComposedOfHelium() {
        return composedOfHelium;
    }

    public void setComposedOfHelium(boolean composedOfHelium) {
        this.composedOfHelium = composedOfHelium;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setComposedOfPlasma(boolean composedOfPlasma) {
        this.composedOfPlasma = composedOfPlasma;
    }

    public boolean isComposedOfPlasma() {
        return composedOfPlasma;
    }

    public boolean isSpaceObjectAStar() {
        if (isComposedOfPlasma() == true && isComposedOfHelium() == true
                && isComposedOfHydrogen() == true) {
            return true;
        } else {
            return false;
        }

    }

}
