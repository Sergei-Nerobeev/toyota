package hu.nero.toyota.detail;

import java.util.Objects;

public class ElectricalSystem extends AbsCrushDetail{
    private String name;

    public ElectricalSystem(String name) {
        this.name = name;
    }

    public ElectricalSystem() {
    }

    @Override
    public String toString() {
        return "ElectricalSystem{}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ElectricalSystem that = (ElectricalSystem) object;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
