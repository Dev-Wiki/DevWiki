package net.devwiki.base.bean;

public class EventData<T> {

    private T data;
    private int code;
    private String desc;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "EventData{" +
                "data=" + data +
                ", code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
