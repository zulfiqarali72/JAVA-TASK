import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ProductInventory {
	  private List<Product> products;
	  
	    public ProductInventory() {
	        products = new ArrayList<>();
	    }

	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    public void removeProduct(Product product) {
	        products.remove(product);
	    }

	    
	    public Product searchProduct(String searchTerm) {
	        Iterator<Product> iterator = products.iterator();

	        while (iterator.hasNext()) {
	            Product product = iterator.next();
	            if (product.getName().equals(searchTerm)) {
	                System.out.println("Product found: " + product.getName());
	                return product;
	            }
	        }

	       System.out.println("Product not found.");
	        return null;

}
	    public void ecofriendlyInfo(String type) {
	      
	        for (Product product : products) {
	            if (product.getType().equals(type) && product.getEcoFriendly()) {
	                product.printInfo();
	                
	            }}}
	    }



