package co.id.pegadaian.sprint.b5.data;

public class Data {

    private int id;
    private String nama;
    private String productCategory;
    private String description;
    private long price;
    private String status;
    private long utang;

    public Data() {
    }

    //untuk input
    public Data(String nama, String productCategory, String description, long price, String status, long utang) {
        this.nama = nama;
        this.productCategory = productCategory;
        this.description = description;
        this.price = price;
        this.status = status;
        this.utang = utang;
    }

    //get data
    public Data(int id, String nama, String productCategory, String description, long price, String status, long utang) {
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

    public long getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public long getUtang() {
        return utang;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUtang(long utang) {
        this.utang = utang;
    }
}
