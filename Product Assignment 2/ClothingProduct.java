
public class ClothingProduct extends Product {
private String size;
private String material;
private String color;
private String style;
public ClothingProduct() {
	
}
public ClothingProduct(String name, String brand, float price, String type, boolean ecoFriendly, String size, String material, String color, String style) {
super(name, brand, price, type, ecoFriendly);
this.size = size;
this.material = material;
this.color = color;
this.style = style;
}
public String getSize() {
	return size;
}
public void setSize(String Size) 
{this.size=size;}

public String getMaterial() {
	return material;
}
public void setMaterial(String material) 
{this.material=material;}
public String getColor(){
	return color;
}
public void setColor( String color) 
{this.color=color;}
public String getStyle() {
	return style;
}
public void setStyle( String style) 
{this.style=style;}

@Override
public void printInfo() {
super.printInfo();
System.out.println("Size: "+size);
System.out.println("Material: "+material);
System.out.println("Color: "+color);
System.out.println("Style:"+style);
}}
