package inheritancepractice;

public class Pokemon {

    private String type;
    private int height;
    private int weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

}
