package com.utils;

import java.util.List;

public class MenuViewUtils {
    public static <T> String getListItemType(List<T> list) {
        T first = list.get(0);
        return getItemType(first);
    }
    public static <T> String getItemType(T item) {
        return item.getClass().getSimpleName();
    }
}
