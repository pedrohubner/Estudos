package com.datastructure.map.treemap;

public class House implements Comparable<House> {

    private String wallColor;
    private String doorColor;

    House(String wallColor, String doorColor) {
        this.doorColor = doorColor;
        this.wallColor = wallColor;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public String getWallColor() {
        return wallColor;
    }

    @Override
    public String toString() {
        return "\nCor da parede: " + wallColor;
    }

    @Override
    public int compareTo(House o) {
        return wallColor.compareTo(o.wallColor);
    }
}
