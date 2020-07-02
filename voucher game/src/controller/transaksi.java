/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;
import database.koneksi;
import java.sql.*;
import java.text.*;
import java.util.*;

public class transaksi {
    koneksi koneksi;
    ArrayList<owner> arrowner;
    ArrayList<pembeli> arrpembeli;
    ArrayList<barang> arrbarang;
    ArrayList<detail_transaksi> arrdetail;

  public transaksi() throws SQLException {
        koneksi = new koneksi();
        arrowner = new ArrayList<>();
        arrpembeli = new ArrayList<>();
        arrbarang = new ArrayList<>();
        arrdetail = new ArrayList<>();
  }
  public ArrayList<owner> getDataOwner() throws SQLException {
        arrowner.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM OWNER");
        while (rs.next()) {
            owner o = new owner();
            o.setId_owner(rs.getInt("ID_OWNER"));
            o.setusername_owner(rs.getString("USERNAME_OWNER"));

            arrowner.add(o);
        }

        return arrowner;
    }
  
   public ArrayList<pembeli> getDataPembeli() throws SQLException {
        arrpembeli.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM PEMBELI");
        while (rs.next()) {
            pembeli p = new pembeli();
            p.setId_pembeli(rs.getInt("ID_PEMBELI"));
            p.setusername_pembeli(rs.getString("USERNAME_PEMBELI"));

            arrpembeli.add(p);
        }

        return arrpembeli;
    }
  
  public ArrayList<barang> getDataBarang() throws SQLException {
        arrbarang.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM BARANG");
        while (rs.next()) {
            barang b = new barang();
            b.setId_barang(rs.getInt("ID_BARANG"));
            b.setharga_voucher(rs.getInt("Harga_Voucher"));
            b.setnama_voucher(rs.getString("NAMA_VOUCHER"));
            b.setstock_barang(rs.getInt("STOCK_BARANG"));

            arrbarang.add(b);
        }
        return arrbarang;
    }
        
    public ArrayList<detail_transaksi> getDatadetail() throws SQLException {
        arrbarang.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM DETAIL_TRANSAKSI");
        while (rs.next()) {
            detail_transaksi dt = new detail_transaksi();
            dt.setId_transaksi(rs.getInt("ID_TRANSAKSI"));
            dt.setId_barang(rs.getInt("ID_BARANG"));
            dt.settgl_transaksi(rs.getDate("TGL_TRANSAKSI"));
            dt.settotal_harga(rs.getFloat("TOTAL_HARGA"));

            arrdetail.add(dt);
        }
        return arrdetail;
        }
  
}  