package me.tuzuku.mp.dynamic.table.core;

public class TableNameContext {

    private static final ThreadLocal<String> CONTEXT = new InheritableThreadLocal<>();

    public static void setContext(String context) {
        CONTEXT.set(context);
    }

    public static String getContext() {
        return CONTEXT.get();
    }

    public static void removeContext() {
        CONTEXT.remove();
    }

}
