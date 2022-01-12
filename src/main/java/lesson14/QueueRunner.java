package lesson14;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueRunner {

    public static void main(String[] args) throws InterruptedException{
        Queue<Integer> numbers = new LinkedList<>();
        System.out.println(numbers.peek());// no exception
//        System.out.println(numbers.element());// throw exception
        numbers.add(1);
        numbers.add(5);
        numbers.add(-12);
        numbers.add(27);
        for (Integer value : numbers) {
            System.out.println(value + " ");
        }
        System.out.println(numbers);


//        List<String> shareResources = new ArrayList<>();
//
//        while (true) {
//            if (!shareResources.isEmpty()) {
//                String word = shareResources.get(0);
//                print(word);
//            }
//            Thread.sleep(1_000);
//        }

       Queue<Integer>priorityQueue=new PriorityQueue<>(/*new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return -o1.compareTo(o2);
           }
       }*/);
       priorityQueue.offer(185);
        priorityQueue.offer(1858);
        priorityQueue.offer(17);
        priorityQueue.offer(10_000);
        priorityQueue.offer(-2);
        System.out.println(priorityQueue);


        BlockingQueue<String>anotherShareResources=new ArrayBlockingQueue<>(10);
        while (true) {
                String take = anotherShareResources.take();
                print(take);
        }
    }

    public static void print(String str){
        System.out.println(str);
    }

}
