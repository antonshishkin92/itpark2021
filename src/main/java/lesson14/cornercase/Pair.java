package lesson14.cornercase;

import java.util.Objects;

public final class Pair {

    private String name;
    private String code;

    public Pair(){}

    public Pair(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return /*Objects.equals(name, pair.name) &&*/ Objects.equals(code, pair.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code /*,name*/);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
