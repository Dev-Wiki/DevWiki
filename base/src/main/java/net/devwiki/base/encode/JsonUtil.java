package net.devwiki.base.encode;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * JSON工具类
 * @author DevWiki
 */
public class JsonUtil {

    private static Gson gson;

    static {
        gson = new GsonBuilder().create();
    }

    public static String toJSON(Object object) {
        return gson.toJson(object);
    }

    public static <T> T fromJSON(String json, Class<T> classType) {
        return gson.fromJson(json, classType);
    }

    public static <T> T fromJSON(String json, Class<?> outType, Class<?>... innerType ) {
        Type type = TypeToken.getParameterized(outType, innerType).getType();
        return gson.fromJson(json, type);
    }

    /**
     * JSON转成集合
     * @param json json字符串
     * @param collectionType 集合类型
     * @param elementType 元素类型
     * @return 集合
     */
    public static <T> T toCollection(String json, Class<?> collectionType, Class<?> elementType) {
        Type type = TypeToken.getParameterized(collectionType, elementType).getType();
        return gson.fromJson(json, type);
    }
}
