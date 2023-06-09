
public class Product {
private String name;
private String brand;
private float price;
private String type;
private boolean ecoFriendly;
public Product() {
	
}
public Product(String name, String brand, float price, String type, boolean ecoFriendly) {
    this.name = name;
    this.brand = brand;
    this.price = price;
    this.type = type;
    this.ecoFriendly = ecoFriendly;
}
public String getName() {
	return name;
}
public void setName(String name) 
{this.name=name;}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) 
{this.brand=brand;}

public float getPrice() {
	return price;
}
public void setPrice(float price) 
{this.price=price;}

public String getType() {
	return type;
}
public void setType( String type) 
{this.type=type;}

public boolean  getEcoFriendly() {
	return ecoFriendly;
}
public void setEmail(boolean ecoFriendly) 
{this.ecoFriendly=ecoFriendly;}
public String toString() {
	return(name+" "+brand+" "+price+" "+type+" "+ecoFriendly);
}
public void printInfo() {
	System.out.println("Name: "+name);
	System.out.println("Brand: "+brand);
	System.out.println("Type: "+type);
	System.out.println("Price: "+price);
	System.out.println("Eco-Friendly: "+ecoFriendly);

}
}

