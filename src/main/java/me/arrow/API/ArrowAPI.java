package me.arrow;

import me.arrow.api.data.PlayerData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface ArrowAPI {

    @NotNull PlayerData getPlayerData(@NotNull Player player);

    @NotNull PlayerData getPlayerData(@NotNull UUID uuid);

    boolean isLoaded(@NotNull UUID uuid);
}
