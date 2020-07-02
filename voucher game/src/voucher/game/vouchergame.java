/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voucher.game;

import view.Transaksiview;
import java.sql.SQLException;
import java.text.ParseException;

public class  vouchergame{

    public static void main(String[] args) throws SQLException, ParseException {
        new Transaksiview().show();
        
                }
}