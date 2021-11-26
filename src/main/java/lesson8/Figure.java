package lesson8;

import java.util.Objects;

public class Figure {
    String name;
    int size;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return size == figure.size && Objects.equals(name,figure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
