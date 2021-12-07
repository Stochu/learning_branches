import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserDao {

        public UserDao() {
                init();
        }

        private Connection connection;
        private final String databaseName = "people";
        private final String tableName = "employees";
        private final String user = "root";
        private final String password = "k1l@i3m$e5k^";


        private void init() {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        connection = DriverManager.getConnection("jdbc:mysql://localhost/"+databaseName+"?useSSL=false", user, password);
                } catch(Exception e) {
                        e.printStackTrace();
                }
        }

        public List<User> getAllUsers() {
                List<User> users = new LinkedList<>();
                Statement statement = null;

                try{
                        statement = connection.createStatement();
                        String query = "SELECT * FROM " + tableName;
                        ResultSet resultSet = statement.executeQuery(query);

                        while(resultSet.next()) {
                                String name = resultSet.getString("name");
                                String lastname = resultSet.getString("lastname");
                                int age = resultSet.getInt("age");

                                User user = new User(name, lastname, age);
                                users.add(user);
                        }
                        statement.close();
                } catch (SQLException e ) {
                        e.printStackTrace();
                }

                return users;
        }

        public void createUser(User user) {
                PreparedStatement statement;
                try {
                        String query = "INSERT INTO " + tableName + " (name, lastname, age) VALUES(?, ?, ?)";
                        statement = connection.prepareStatement(query);

                        statement.setString(1, user.getName());
                        statement.setString(2, user.getLastName());
                        statement.setInt(3, user.getAge());

                        statement.execute();
                        statement.close();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
}


