package model;

public class Classes {
    private int id;
    private  String name;
    private String language;
    private String description;

    public Classes() {
    }

    public Classes(int id, String name, String language, String description) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
