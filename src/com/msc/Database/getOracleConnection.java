/**
 * @Decsriptoin : Target of this apps is to get all filenames inside the inputed folder and subfolder into Spreadsheet   .
 * @author      : MavajSunCo
 * @Date        : 8-JUN-2011
 * @Email       : info@mavajsunco.com
 * @Website     : www.MavajSunCo.com
 **/
package com.msc.Database;

import java.sql.*;

public class getOracleConnection {

    public getOracleConnection() {
    }

    public Connection dbConnect(String db_connect_string,
            String db_userid, String db_password) {
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn = DriverManager.getConnection( db_connect_string, db_userid, db_password);
            System.out.println("connected");
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
};
