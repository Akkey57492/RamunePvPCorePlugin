package tokyo.ramune.ramunepvpcoreplugin.database;

public class DatabaseManager {

    public static void createTables() {
        if (!SQL.tableExists("players")) {
            SQL.createTable("players", "uuid NOT NULL, latest_join_date DATETIME NOT NULL, prefix text NOT NULL, language text NOT NULL");
        }
        if (!SQL.tableExists("prefixes")) {
            SQL.createTable("prefixes", "name text NOT NULL, color text NOT NULL");
        }
    }
}
