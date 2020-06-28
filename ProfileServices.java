import java.sql.SQLException;
import java.util.List;

public interface ProfileServices {
    Profil insert(Profil BIO) throws SQLException;
    void update(Profil BIO) throws SQLException;
    void delete(String id) throws SQLException;
    List getAll() throws SQLException;
}
