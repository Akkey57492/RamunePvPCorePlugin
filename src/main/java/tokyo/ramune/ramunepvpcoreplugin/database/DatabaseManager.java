package tokyo.ramune.ramunepvpcoreplugin.database;

public class DatabaseManager {

    public static void createTables() {
        if (!SQL.tableExists("players")) {
            SQL.createTable("players", "UUID NOT NULL, Latest_join_date DATETIME NOT NULL, Language text NOT NULL");
        }
    }
}
