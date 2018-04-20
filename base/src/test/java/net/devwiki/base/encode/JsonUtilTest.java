package net.devwiki.base.encode;

import net.devwiki.base.bean.EventData;
import net.devwiki.base.bean.Role;
import net.devwiki.base.bean.RoleData;
import net.devwiki.base.bean.RoleType;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonUtilTest {

    private Role mRole;
    private List<Role> mRoleList;
    private EventData<Role> mData;

    @Before
    public void prepareData() {
        mRole = new Role();
        mRole.setName("daji");
        mRole.setRoleType(RoleType.FaShi);

        Role diaoChan = new Role();
        diaoChan.setName("diaochan");
        diaoChan.setRoleType(RoleType.FaShi);
        mRoleList = new ArrayList<>();
        mRoleList.add(mRole);
        mRoleList.add(diaoChan);

        mData = new EventData<>();
        mData.setCode(100);
        mData.setDesc("success");
        mData.setData(mRole);
    }

    @Test
    public void toJSON() {
        assert "1".equals(JsonUtil.toJSON(1));
        assert "null".equals(JsonUtil.toJSON(null));
        System.out.println(JsonUtil.toJSON("Hello!"));
        assert "\"Hello!\"".equals(JsonUtil.toJSON("Hello!"));
        System.out.println(JsonUtil.toJSON(mRole));
        System.out.println(JsonUtil.toJSON(mRoleList));
        System.out.println(JsonUtil.toJSON(mData));
    }

    @Test
    public void fromJSON() {
        Role role = JsonUtil.fromJSON(JsonUtil.toJSON(mRole), Role.class);
        assert role.getName().equals(mRole.getName());
        assert role.getRoleType() == mRole.getRoleType();
        EventData<Role> data = JsonUtil.fromJSON(JsonUtil.toJSON(mData),
                EventData.class, Role.class);
        System.out.println(data);
        assert data.getCode() == mData.getCode();
    }

    @Test
    public void toCollection() {
        List<Role> list = JsonUtil.toCollection(JsonUtil.toJSON(mRoleList), List.class, Role.class);
        assert list.size() == 2;
        assert list.get(0).getRoleType() == RoleType.FaShi;
    }
}