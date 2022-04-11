package com.socialmedia;

import com.socialmedia.jdbc.DbManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite{

    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws    SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID")  + ","+
                    rs.getString("FIRSTNAME") + ","  +
                    rs.getString("LASTNAME"));
            counter++;
            }

        rs.close();
            statement.close();
            Assertions.assertEquals(5,counter);
        }
    }


