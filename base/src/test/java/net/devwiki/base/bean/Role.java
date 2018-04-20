package net.devwiki.base.bean;

public class Role {

    private String name;
    private RoleType mRoleType;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRoleType() {
        return mRoleType;
    }

    public void setRoleType(RoleType roleType) {
        mRoleType = roleType;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", mRoleType=" + mRoleType +
                '}';
    }
}
