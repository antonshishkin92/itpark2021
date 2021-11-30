package lesson8;

public class Animal {
    private String name;
    private String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

   public void speak(){
       this.voice = voice;
       System.out.println(this.name + " Говорит " + this.voice);
   }


}
