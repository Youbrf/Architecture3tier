package be.brf.poo;

import java.io.Serializable;

/**
 * @author Youssef
 */
public class Data implements Serializable {
    private String info;
    private int level;
    private boolean free;

    public Data() {
    }

    public Data(String info, int level, boolean free) {
        this.info = info;
        this.level = level;
        this.free = free;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Data{" +
                "info='" + info + '\'' +
                ", level=" + level +
                ", free=" + free +
                '}';
    }
}
