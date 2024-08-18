package edu.faf.oop.RootClass;

import java.util.UUID;

public class Root {
    protected String itemId;

    protected void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Root(String itemId)
    {
        this.itemId = itemId;
    }
    protected String getItemId(){
        return this.itemId;
    }

    protected String generateId() {
        UUID id = UUID.randomUUID();

        return id.toString();
    }
}
