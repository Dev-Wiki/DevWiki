package net.devwiki.base.bean;

public enum RoleType {

    FaShi("法师");

    private String displayName;
    RoleType(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
