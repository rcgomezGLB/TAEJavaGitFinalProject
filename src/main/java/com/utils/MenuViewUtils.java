package com.utils;

public class MenuViewUtils {
    public static <T> String getItemType(T item) {
        return item.getClass().getSimpleName();
    }
}
