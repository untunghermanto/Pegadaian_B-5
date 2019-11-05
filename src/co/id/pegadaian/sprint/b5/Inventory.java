package co.id.pegadaian.sprint.b5;

public class Inventory {
	private int id;
	private String nama;
	private String produk;
	private String deskripsi;
	private int harga;
	public Inventory(int id, String nama, String produk, String deskripsi, int harga) {
		super();
		this.id = id;
		this.nama = nama;
		this.produk = produk;
		this.deskripsi = deskripsi;
		this.harga = harga;
	}
	public int getId() {
		return id;
	}
	public String getNama() {
		return nama;
	}
	public String getProduk() {
		return produk;
	}
	public String getDeskripsi() {
		return deskripsi;
	}
	public int getHarga() {
		return harga;
	}
	
	
}
