package inheritancepractice;

public class Refrigerator extends Appliance {

    private String color;
    private String exteriorMaterial;
    private boolean builtInWaterDispenser;
    private boolean energyStarStatus;

    public boolean isEnergyStarStatus() {
        return energyStarStatus;
    }

    public void setEnergyStarStatus(boolean energyStarStatus) {
        this.energyStarStatus = energyStarStatus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getExteriorMaterial() {
        return exteriorMaterial;
    }

    public void setExteriorMaterial(String exteriorMaterial) {
        this.exteriorMaterial = exteriorMaterial;
    }

    public boolean isBuiltInWaterDispenser() {
        return builtInWaterDispenser;
    }

    public void setBuiltInWaterDispenser(boolean builtInWaterDispenser) {
        this.builtInWaterDispenser = builtInWaterDispenser;
    }

    @Override
    public String determineIfWorthKeeping() {
        if (getAgeInYears() <= 10) {
            if (isFunctionalStatus() == true) {
                return "Still works and is relatively new. Keep it.";
            } else {
                if (isEnergyStarStatus() == true) {
                    if (getExteriorMaterial().equalsIgnoreCase("Stainless Steel")) {
                        return "I would keep this refrigerator because it contains the energy star"
                                + "seal on it and it composed of stainless steel. You probably already paid"
                                + "a pretty penny for it so I'd take it in for repair as it will be worth it.";
                    }
                    else {
                        return "You may have to sleep on this one overnight as it might be worth it to"
                                + "just buy a new appliance.";
                    }
                } else {
                    return "This is not energy efficient, is probably made of plastic, and is not working. Get a"
                            + "new refrigerator.";
                }
            }
        } else {
            if (isFunctionalStatus() == true) {
                return "It may be an older appliance but it still works.";
            } else {
                return "It's time to get a new one as there are probably food stains inside anyway";
            }
        }
    }
}
