package com.utils;

import java.util.List;

public class MenuViewUtils {
    public static <T> String getItemType(T item) {
        return item.getClass().getSimpleName();
    }
}
