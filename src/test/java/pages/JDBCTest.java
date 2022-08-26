package pages;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utilities.DataBaseUtils;

import java.sql.*;

public class JDBCTest {
    private static Connection connection;
    private static Statement statement;
    private static final String JDBC_URL = "jdbc:mysql://3.129.60.236:3306/digitalbank?user=digitaluser&password=Demo123!";


//    public void initDatabase() throws Exception {
//        // 1. Connect to the Database
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        con = DriverManager.getConnection("3.129.60.236:3306", "digitaluser", "Demo123!");
        @Before
        public void open() {
            try {
                if (connection == null) {
                    connection = DriverManager.getConnection(JDBC_URL);
                    statement = connection.createStatement();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                Assert.fail("Can't establish connection to DB");
            }
        }
    @Test
    public void verifyTheTransactionAmount(){
        String transactionAmount = getTransactionAmount("845320543");

        Assert.assertEquals("25.00",transactionAmount);

    }
    @After
    public void closeConnection() throws Exception{
        // 4. Close the connection
        connection.close();
    }
    public static String getTransactionAmount(String transactionNumber) {
        ResultSet result = executeQuery("select amount from digitalbank.account_transaction where transaction_number ='"+transactionNumber+"';");
        String amount = "";

        try {
            result.next();
            amount = result.getString(1);
            System.out.println(amount);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return amount;
    }

    public static ResultSet executeQuery(String query){
        // 2. Query the Database
        ResultSet result = null;
        try {
            Statement stmt = connection.createStatement();
            result = stmt.executeQuery(query);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}


