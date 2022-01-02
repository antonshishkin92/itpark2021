package lesson12.cornercase;

import lesson12.exception.UnnamedException;

public class BlockRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("Попытаемся инициализировать блок");
        InitialiazingBlock initialiazingBlock = new InitialiazingBlock();
        System.out.println(initialiazingBlock.getName());
    }
}
