package model;

import java.sql.Date;

public class detail_transaksi {
    private Integer Id_transaksi;
    private Integer Id_barang;
    private Float total_harga;
    private Date  tgl_transaksi;

    public Integer getId_transaksi() {
        return Id_transaksi;
    }

    public void setId_transaksi(Integer Id_transaksi) {
        this.Id_transaksi = Id_transaksi;
    }

    public Integer getId_barang() {
        return Id_barang;
    }

    public void setId_barang(Integer Id_barang) {
        this.Id_barang = Id_barang;
    }
    public Float gettotal_harga() {
        return total_harga;
    }

    public void settotal_harga(Float total_harga) {
        this.total_harga = total_harga;
    }
    
    public Date gettgl_transaksi() {
        return tgl_transaksi;
    }

    public void settgl_transaksi(Date tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

   
}

