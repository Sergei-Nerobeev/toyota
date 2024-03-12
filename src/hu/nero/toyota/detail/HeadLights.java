package hu.nero.toyota.detail;

import java.util.Objects;

/*
* Фары
* */
public class HeadLights extends AbsCrushDetail {
    private String name;
    @Override
    public String toString() {
        return "HeadLights{}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        HeadLights headLights = (HeadLights) object;
        return Objects.equals(name, headLights.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
