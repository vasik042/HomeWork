import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    String password;
    String email;
    String firstName;
    String secondName;
    int id;

    public User(String firstName, String secondName, String email, String password) {
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public static User of(ResultSet resultSet) throws SQLException {
        User user = new User(resultSet.getString("first_name"), resultSet.getString("second_name"), resultSet.getString("email"), resultSet.getString("password"));
        user.setId(resultSet.getInt("id"));
        return user;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.secondName;
    }

    public void setLastName(String lastName) {
        this.secondName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String login) {
        this.password = login;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", id=" + id +
                '}';
    }
}
