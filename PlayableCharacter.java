package lab1;

import java.util.Objects;

public class Playable_characters extends Character {
    private int playingState;
    private double distanceTraveled;
    private int passedLevels;

    public Playable_characters(Character obj) {
        this.name = obj.getName();
        this.health = obj.getHealth();
        this.attack = obj.getAttack();
    }

    public int getPlayingState() {
        return playingState;
    }

    public void setPlayingState(int playingState) {
        this.playingState = playingState;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getPassedLevels() {
        return passedLevels;
    }

    public void setPassedLevels(int passedLevels) {
        this.passedLevels = passedLevels;
    }

    public void increaseDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = this.distanceTraveled + distanceTraveled;
    }

    public void increasePassedLevels(int passedLevels) {
        this.passedLevels = this.passedLevels + passedLevels;
    }

    @Override
    public String toString() {
        return "Playable_characters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", playingState=" + playingState +
                ", distanceTraveled=" + distanceTraveled +
                ", passedLevels=" + passedLevels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Playable_characters that = (Playable_characters) o;
        return playingState == that.playingState && Double.compare(that.distanceTraveled, distanceTraveled) == 0 && passedLevels == that.passedLevels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), playingState, distanceTraveled, passedLevels);
    }
}
