package lesson18.dto;

import lombok.*;

@Data
@EqualsAndHashCode//(exclude = "height")
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor

public class Person  {
    private  String name;
    private int age;
    private Sex sex;
    private double height;


    public Person(String name){
        this.name=name;
    }

    public void beOlder()throws Exception{
        this.age++;
    }
}
