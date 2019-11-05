package co.id.pegadaian.sprint.b5.data;

public class Data {

    private int id;
    private String nama;
    private String productCategory;
    private String description;
    private Double price;
    private String status;
    private Double utang;

    public Data() {
    }

    public Data(int id, String nama, String productCategory, String description, Double price, String status, Double utang) {
        this.id = id;
        this.nama = nama;
        this.productCategory = productCategory;
        this.description = description;
        this.price = price;
        this.status = status;
        this.utang = utang;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public Double getUtang() {
        return utang;
    }
}
