package inheritancepractice;

public class AstronomicalBody {

    private int mass;
    private int magneticFieldStrength;
    private String spaceObject;
    private boolean hasPlasma;

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMagneticFieldStrength(int magneticFieldStrength) {
        this.magneticFieldStrength = magneticFieldStrength;
    }

    public int getMagneticFieldStrength() {
        return magneticFieldStrength;
    }

    public void setSpaceObject(String spaceObject) {
        this.spaceObject = spaceObject;
    }

    public String getSpaceObject() {
        return spaceObject;
    }

    public void setHasPlasma(boolean hasPlasma) {
        this.hasPlasma = hasPlasma;
    }

    public boolean isHasPlasma() {
        return hasPlasma;
    }

    public boolean isSpaceObjectAStar() {
        if (getSpaceObject().equalsIgnoreCase("Luminous Sphere") && isHasPlasma() == true) {
            return true;
        } else {
            return false;
        }

    }

}
