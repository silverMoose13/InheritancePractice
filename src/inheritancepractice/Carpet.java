package inheritancepractice;

public class Carpet extends Furnishing {

    private String typeOfCouch;
    private String firmnessRating;
    private int length;

    public String getTypeOfCouch() {
        return typeOfCouch;
    }

    public void setTypeOfCouch(String typeOfCouch) {
        this.typeOfCouch = typeOfCouch;
    }

    public String getFirmnessRating() {
        return firmnessRating;
    }

    public void setFirmnessRating(String firmnessRating) {
        this.firmnessRating = firmnessRating;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double determineSurfaceArea() {
        return determineArea(getLength(), getWidth()) * getLength();
    }
}
