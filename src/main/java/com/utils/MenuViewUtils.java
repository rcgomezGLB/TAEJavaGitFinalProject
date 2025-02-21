package com.utils;

import com.model.Teacher;

public class MenuViewUtils {
    public static <T> String getItemType(T item) {
        if (item instanceof Teacher) {
            return Teacher.class.getSimpleName();
        }
        return item.getClass().getSimpleName();
    }
}
