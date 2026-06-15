package me.arrow.API;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ArrowAPIProvider {
    private static volatile ArrowAPI instance;

    private ArrowAPIProvider() {
    }

    public static void set(@NotNull ArrowAPI api) {
        instance = api;
    }

    public static void clear() {
        instance = null;
    }

    public static @Nullable ArrowAPI get() {
        return instance;
    }

    public static @NotNull ArrowAPI require() {
        ArrowAPI api = instance;
        if (api == null) {
            throw new IllegalStateException("ArrowAPI is not available.");
        }
        return api;
    }
}