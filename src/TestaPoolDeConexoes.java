import java.sql.SQLException;

public class TestaPoolDeConexoes {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        for (int i = 0; i < 20; i++) {
            connectionFactory.connectToDatabase();
        }
    }
}
