import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

public class CustomerInformationScreenRepository {
//        public static void main(String args[]) {
//            CustomerInformationScreenRepository cir = new CustomerInformationScreenRepository();
//            System.out.println(cir.getCustomerInformation(30).getFirstName());
//            System.out.println(cir.getCustomerInformation(30).getLastName());
//            System.out.println(cir.getCustomerInformation(30).getAddress());
//            System.out.println(cir.getCustomerInformation(30).getPhoneNumber());
//            System.out.println(cir.getCustomerInformation(30).getCreditCardNumber());
//            System.out.println(cir.getCustomerInformation(30).getCreditCardBalance());
      }

        public CustomerInfo getCustomerInformation(int ccid) {
            CustomerInfo customerInfo = null;
            try {
                String query = "select * from callcenter.customers where ccid = " + ccid;
                Class.forName("com.mysql.cj.jdbc.Driver");
                String connectionString = "jdbc:mysql://localhost:3306/callcenter";
                Connection dbConnection = DriverManager.getConnection(connectionString, "root", "");
                Statement statement = dbConnection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                if(resultSet.next()) {
                    customerInfo = createCustomerObject(resultSet);
                }
                dbConnection.close();
            }
            catch (SQLException | ClassNotFoundException e )
            {
                e.printStackTrace();
            }
            return customerInfo;
        }

    private CustomerInfo createCustomerObject(ResultSet resultSet) {
        CustomerInfo customerInfo = null;
        try {
            customerInfo = new CustomerInfo(resultSet.getInt("ccid"), resultSet.getString("first_name"), resultSet.getString("last_name"), resultSet.getString("billing_address_1"), resultSet.getString("primary_phone"), resultSet.getInt("chase_account_no"), resultSet.getDouble("agg_cc_balance"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerInfo;
    }

}
