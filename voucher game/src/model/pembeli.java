package model;

public class pembeli {
    private Integer Id_pembeli;
    private String  username_pembeli;
    private String  alamat_pembeli;
    private Integer no_telp_pembeli;
    
     public Integer getId_pembeli() {
        return Id_pembeli;
    }

    public void setId_pembeli(Integer Id_pembeli) {
        this.Id_pembeli = Id_pembeli;
    }

    public String getusername_pembeli() {
        return username_pembeli;
    }
    
    public void setusername_pembeli(String username_pembeli) {
        this.username_pembeli = username_pembeli ;
    }
    
    public void setalamat_pembeli(String alamat_pembeli) {
        this.alamat_pembeli = alamat_pembeli;
    }
    
    public Integer no_telp_pembeli() {
        return no_telp_pembeli;
    }

    public void setno_telp_pembeli (Integer no_telp_pembeli) {
        this.no_telp_pembeli = no_telp_pembeli;
    }
}
