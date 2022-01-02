package lesson12.cornercase;

import lesson12.exception.UnnamedException;

public class InitialiazingBlock {

    private final String name;

 //  {
 //       name="Example";
 //   }

    public InitialiazingBlock()throws UnnamedException{
        throw new UnnamedException("Задайте имя объекту");

    }

    public InitialiazingBlock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
