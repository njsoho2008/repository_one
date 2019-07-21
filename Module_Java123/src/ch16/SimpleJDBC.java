package ch16;

import java.sql.*;

public class SimpleJDBC {

    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
        //建立连接对象
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/test",
                "root","root");

        //
        Statement statement=connection.createStatement();
        String sqls="select firstName,middlename,lastName from Student where lastName='chen'";
        ResultSet resultSet=statement.executeQuery(sqls);

        while (resultSet.next()){
            System.out.println(resultSet.getString("firstName")+"\t"+
                    resultSet.getString(2)+"\t"
            +resultSet.getString(3));
        }

        connection.close();
    }
}
