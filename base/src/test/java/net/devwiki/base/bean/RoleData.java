package net.devwiki.base.bean;

public class RoleData<T> {

    private int num;
    private T data;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RoleData{" +
                "num=" + num +
                ", data=" + data +
                '}';
    }
}
