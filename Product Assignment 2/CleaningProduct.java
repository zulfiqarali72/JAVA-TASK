public class CleaningProduct extends Product {
    private String surfaceType;
    private String scent;
    private boolean biodegradable;

    public CleaningProduct() {
       
    }

    public CleaningProduct(String name, String brand,float price, String type, boolean ecoFriendly,String surfaceType, String scent, boolean biodegradable) {
        super(name, brand, price, type, ecoFriendly);
        this.surfaceType = surfaceType;
        this.scent = scent;
        this.biodegradable = biodegradable;
    }

    public String getSurfaceType() {
        return surfaceType;
    }

    public void setSurfaceType(String surfaceType) {
        this.surfaceType = surfaceType;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public boolean isBiodegradable() {
        return biodegradable;
    }

    public void setBiodegradable(boolean biodegradable) {
        this.biodegradable = biodegradable;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Surface Type: " + surfaceType);
        System.out.println("Scent: " + scent);
        System.out.println("Biodegradable: " + biodegradable);
    }
}