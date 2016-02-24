package org.hispindia.bidtrackerreports.mvp.model.local;

/**
 * Created by nhancao on 1/25/16.
 */
public class HIBIDRowItem {
    private String id;
    private String name;
    private String value;

    public HIBIDRowItem(String id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}