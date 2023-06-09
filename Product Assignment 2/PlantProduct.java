
public class PlantProduct extends Product {
	 private String potType;
	    private String sunlightNeeds;
	    private String typeOfPlant;
	    
	    public PlantProduct() {}
	    
	    public PlantProduct(String name, String brand, float price, String type, boolean ecoFriendly,String potType,String sunlightNeds,String typeOfPlant,String getTypeOfPlant){
	    	super(name,brand,price,type,ecoFriendly);
			this.potType= potType;
			this.sunlightNeeds =sunlightNeeds;
			this.typeOfPlant = typeOfPlant;
	    }
	    public String getPotType() {
	        return potType;
	    }

	    public void setPotType(String potType) {
	        this.potType = potType;
	    }

	    public String getSunlightNeeds() {
	        return sunlightNeeds;
	    }

	    public void setSunlightNeeds(String sunlightNeeds) {
	        this.sunlightNeeds = sunlightNeeds;
	    }

	    public String getTypeOfPlant() {
	        return typeOfPlant;
	    }
	    public void setTypeOfPlant(String typeOfPlant) {
	        this.typeOfPlant = typeOfPlant;
	    }

	    @Override
	    public void  printInfo() {
	        super.printInfo();
	        System.out.println("Pot Type: "+potType);
	        System.out.println("Sunlight Needs: "+sunlightNeeds);
	        System.out.println("Type of Plant: "+typeOfPlant);
	    }
}
