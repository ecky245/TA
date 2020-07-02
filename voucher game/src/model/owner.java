package model;

public class owner {
    private owner Owner;
    private Integer Id_owner;
    private String  username_owner;
    private String password;
    
    
public owner getowner() {
        return Owner;
    }

    public void setOwner(owner owner) {
        this.Owner = owner;
    }

    public Integer getId_owner() {
        return Id_owner;
    }

    public void setId_owner(Integer Id_owner) {
        this.Id_owner = Id_owner;
    }

    public String getusername_owner() {
        return username_owner;
    }

    public void setusername_owner(String username_owner) {
        this.username_owner = username_owner;
    }
    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}