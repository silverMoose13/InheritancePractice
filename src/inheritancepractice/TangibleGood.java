package inheritancepractice;

public class TangibleGood {

    private int height;
    private int width;
    private String roomSelection;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getRoomSelection() {
        return roomSelection;
    }

    public void setRoomSelection(String roomSelection) {
        this.roomSelection = roomSelection;
    }
    
    public double determineArea(int length, int width) {
        return length * width;
    }

}
