package lesson8;

class Animal {
    private String name;
    private String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        this.voice = voice;
        System.out.println(this.name + " говорит " + this.voice);
    }


}
