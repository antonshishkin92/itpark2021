package lesson12;

public class Cloning implements Cloneable {
    public String name;
    public Long id;
    public double size;

    public Cloning(Cloning copy) {
        this.id = copy.id;
        this.name = copy.name;
        this.size = copy.size;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
