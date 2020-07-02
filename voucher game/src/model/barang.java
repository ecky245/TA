
package model;

import java.sql.Array;

public class barang {
    private Integer Id_barang;
    private String  nama_voucher;
    private Integer harga_voucher;
    private Integer stock_barang;
    
     public Integer getId_barang() {
        return Id_barang;
    }

    public void setId_barang(Integer Id_barang) {
        this.Id_barang = Id_barang;
    }

    public Integer harga_voucher() {
        return harga_voucher;
    }

    public void setharga_voucher(Integer harga_voucher) {
        this.harga_voucher = harga_voucher;
    }
    public Integer stock_barang() {
        return stock_barang;
    }

    public void setstock_barang (Integer stock_barang) {
        this.stock_barang = stock_barang;
    }

  public String getnama_voucher() {
        return nama_voucher;
    }

    public void setnama_voucher(String nama_voucher) {
        this.nama_voucher = nama_voucher;
    }
}
