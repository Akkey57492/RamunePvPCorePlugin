package tokyo.ramune.ramunepvpcoreplugin.prefix;

import tokyo.ramune.ramunepvpcoreplugin.database.SQL;

public class Prefix {

    private String name, color;

    public Prefix(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        SQL.set("name", name, "name", "=", this.name, "prefixes");
        this.name = name;
    }

    public String getColor() {
        return String.valueOf(SQL.get("color", "name", "=", name, "prefixes"));
    }
}
