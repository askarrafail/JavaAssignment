package data.interfaces;

import java.sql.Connection;

public interface IDBManager {
    Connection getConnection();
}
