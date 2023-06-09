
public class TestProduct {
	public static void main(String[] args) {
		ProductInventory p =new ProductInventory();
		ClothingProduct brandShirt = new ClothingProduct("Eco T-Shirt", "OrganicWear", 25.99f,"Clothing", true, "M", "Organic Cotton", "Green", "Casual");
		ClothingProduct brandJeans = new ClothingProduct("Eco Jeans", "Levi's", 89.99f,"Clothing", true, "32/32", "Recycled Denim", "Blue", "Slim Fit");
		 String[] targetConcern= {"None"};
		SkincareProduct brandShampoo = new SkincareProduct("Shampoo", "Pantene", 8.99f, "Skincare", false, "Normal", targetConcern,false);
		CleaningProduct brandAllCleaner = new CleaningProduct("All-Purpose Cleaner", "Clorox", 4.99f,"Cleaning", false, "Multi-Surface", "Lavender", false);
		ElectronicProduct brandSmartSpeaker = new ElectronicProduct("Smart Speaker", "Amazon", 99.99f,"Electronic", false, "Electricity", true, true);
		 ElectronicProduct brandThermostat = new ElectronicProduct( "Smart Thermostat","Nest",249.99f,	"Electronic",true,"AC, Energy",true,true);
	
		p.addProduct(brandShirt);
		p.addProduct(brandThermostat);
		p.addProduct(brandSmartSpeaker);
		p.addProduct(brandShampoo);
		p.addProduct(brandJeans);
		 p.searchProduct("Eco Jeans");
		 p.searchProduct("Shampo");
		 p.searchProduct("Book");
		 brandShirt.printInfo();
		 brandShampoo.printInfo();
		 brandSmartSpeaker.printInfo();
		
	}}

