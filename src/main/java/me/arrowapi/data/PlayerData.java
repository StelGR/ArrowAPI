package me.arrowapi.data;

public interface PlayerData {

    CombatData getCombatData();

    double getSensitivity();

    String getLastFlaggedCheck();

    int getTotalLogs();
}
