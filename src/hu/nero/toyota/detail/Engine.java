package hu.nero.toyota.detail;

import java.util.Objects;

public class Engine extends AbsCrushDetail {
    private String name;
    @Override
    public String toString() {
        return "Engine{}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Engine engine = (Engine) object;
        return Objects.equals(name, engine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
