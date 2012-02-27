/**
 * @Decsriptoin : Target of this apps is to get all filenames inside the inputed folder and subfolder into Spreadsheet   .
 * @author      : Ali Jamali ( MavajSunCo )
 * @Date        : 8-JUN-2011
 * @Email       : info@mavajsunco.com
 * @Website     : www.MavajSunCo.com
 **/
package com.msc.convert;

import java.sql.*;
import com.msc.Database.getOracleConnection;
import com.msc.Translate.LanguageTranslate;

public class Main {

    public static void main(String args[]) throws SQLException, Exception {

        LanguageTranslate LT = new LanguageTranslate();

        getOracleConnection db = new getOracleConnection();
        Connection connection1 = db.dbConnect("jdbc:oracle:thin:@192.168.110.125:1521:xe", "ARAMCO", "ARAMCO");
        Connection connection2 = db.dbConnect("jdbc:oracle:thin:@192.168.110.125:1521:xe", "ARAMCO", "ARAMCO");
       //declare object of Statement interface that uses for executing sql statements.
        Statement statement1 = null;
        Statement statement2 = null;

        // declare a resultset that uses as a table for   output data from the table.
        ResultSet rs = null;
        int updateQuery = 0;

        /* createStatement() is used for create statement object that is used for sending sql statements to the specified database. */
       statement1 = connection1.createStatement();
       statement2 = connection2.createStatement();

        // sql query of string type to create a data base.
        // String QueryString = "CREATE TABLE    ";

        // updateQuery = statement.executeUpdate(QueryString);

        // sql query to insert values in the specified table.
        // QueryString = "INSERT INTO ";

        // updateQuery = statement.executeUpdate(QueryString);

        // if (updateQuery != 0) {
        // System.out.println("table is created successfully and " + updateQuery + " row is inserted.");
        // }

        // sql query to retrieve values from the specified table.  
        String QueryString = "SELECT * from cm_category where id>6000 and id<6500";
        rs = statement1.executeQuery(QueryString);
        

       while (rs.next()) {
            System.out.println(rs.getInt(1) + "  , " + rs.getString(4) +  "\n");
            
            try{
             statement2.executeUpdate("INSERT INTO TRANSLATEDCATEGORY (categoryid,languageid,name) values (" + rs.getInt(1) + ",2,'" + LT.Translate(rs.getString(4)) + "')");
               System.out.println(updateQuery++);
            }catch(SQLException e){e.printStackTrace();continue;}         
        }
        rs.close();
        statement1.close();
        statement2.close();
        connection1.close();
        connection2.close();
    }
}
