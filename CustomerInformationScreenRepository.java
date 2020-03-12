import java.sql.*;

public class CustomerInformationScreenRepository {
    public static void main(String args[]) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost:3306/callcenter";
            Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/callcenter", "root", "");

            Statement statement = con.createStatement();
            ResultSet resultSet = statement.excecuteQuery("select * from accounts");
            while (rs.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                con.close();
            }
        }
        catch(Exception e) {System.out.println(e);}
    }
//    public String GetFirstName() {
//
//    }
//
//    public String GetLastName()
//    {
//
//    }
//
//    public String GetCustomerId() {
//
//    }
//
//    public String GetAddress()
//    {}
//
//    public String GetPhoneNumber()
//    {}
//
//    public String GetCreditCardNumber()
//    {}
//
//    public String GetCurrentCreditCardBalance()
//    {}

}