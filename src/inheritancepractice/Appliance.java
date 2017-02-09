package inheritancepractice;

public class Appliance extends Machine {

    private String energyType;
    private boolean cordless;

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public boolean isCordless() {
        return cordless;
    }

    public void setCordless(boolean cordless) {
        this.cordless = cordless;
    }

    @Override
    public String determineIfWorthKeeping() {
        if (getAgeInYears() <= 10) {
            if (isFunctionalStatus() == true) {
                return "Still works and is relatively new. Keep it.";
            } else {
                if (getEnergyType().equalsIgnoreCase("Gas")) {
                    return "I would keep this appliance because it is energy efficient. Take"
                            + "it in for repair though.";
                } else {
                    return "This is not energy efficient to begin with nor is it working. Get a"
                            + "new appliance.";
                }
            }
        } else {
            if (isFunctionalStatus() == true) {
                return "It may be an older appliance but it still works.";
            } else {
                return "It's time to get a new one.";
            }
        }
    }

}
