
public class ElectronicProduct  extends Product {
	private String powerSource;
    private boolean energyEfficient;
    private boolean smartHomeCompatible;
    public ElectronicProduct() {
        
    }

    public ElectronicProduct(String name, String brand, float price, String type, boolean ecoFriendly,String powerSource, boolean energyEfficient, boolean smartHomeCompatible) {
        super(name, brand, price, type, ecoFriendly);
        this.powerSource = powerSource;
        this.energyEfficient = energyEfficient;
        this.smartHomeCompatible = smartHomeCompatible;
    }
    
    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public boolean isEnergyEfficient() {
        return energyEfficient;
    }

    public void setEnergyEfficient(boolean energyEfficient) {
        this.energyEfficient = energyEfficient;
    }

    public boolean getSmartHomeCompatible() {
        return smartHomeCompatible;
    }
    public void setSmartHomeCompatible(boolean smartHomeCompatible) {
        this.smartHomeCompatible = smartHomeCompatible;
    }

    @Override
    public void  printInfo()  {
        super.printInfo();
        System.out.println("Power Source: "+powerSource);
        System.out.println("Energy Efficient: "+energyEfficient);
        System.out.println("Smart Home Compatible: "+smartHomeCompatible);
    }
}
