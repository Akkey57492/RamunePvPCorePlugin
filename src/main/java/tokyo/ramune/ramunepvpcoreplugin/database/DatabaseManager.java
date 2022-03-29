package tokyo.ramune.ramunepvpcoreplugin.database;

public class DatabaseManager {

    public static void createTables() {
        if (!SQL.tableExists("players")) {
            SQL.createTable("players", "uuid TEXT NOT NULL, username TEXT NOT NULL ,language TEXT NOT NULL ,prefix TEXT NOT NULL , latest_join_date DATETIME NOT NULL, status BIT");
        }
        if (!SQL.tableExists("prefixes")) {
            SQL.createTable("prefixes", "name text NOT NULL, color text NOT NULL");
        }
    }
}
