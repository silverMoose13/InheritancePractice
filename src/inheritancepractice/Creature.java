package inheritancepractice;

public class Creature {

    private boolean tail;
    private boolean scales;
    private boolean fins;
    private int height;
    private int weight;

    public boolean isFins() {
        return fins;
    }

    public void setFins(boolean fins) {
        this.fins = fins;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean isScales() {
        return scales;
    }

    public void setScales(boolean scales) {
        this.scales = scales;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean determineIfAbleToSwim() {
        if (isScales() == true && isTail() == true && isFins() == true) {
            return true;
        } else {
            return false;
        }
    }
}
