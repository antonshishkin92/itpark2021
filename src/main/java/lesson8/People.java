package lesson8;

public class People {
    public static void main(String[] args) {
        Human me = new Male("Шишкин Антон Алексеевич", 29, "русский");
        Human nataliaIvanovna = new Female("Петрова Наталья Ивановна", 36, "русская");
        me.beOlder();
        nataliaIvanovna.changeNationality("француженка");
        me.changeName("Шишкин Антон");
        nataliaIvanovna.changeName("Натали Портман");
        nataliaIvanovna.setAge(34);
        System.out.println(me);
        System.out.println(nataliaIvanovna);
        Human[] people = new Human[]{me, nataliaIvanovna};
        for (Human human : people) {
            human.setAge(40);
        }
        System.out.println("----------------");
        System.out.println(me);
        System.out.println(nataliaIvanovna);
        System.out.println("----------------");
        ((Male)me).drive();
        ((Female)nataliaIvanovna).cook();
Female ninaPetrovna = new Female("Сидорова Нина Петровна",23,"русская");
        ((Female)nataliaIvanovna).changeName(ninaPetrovna);
        System.out.println(ninaPetrovna);
    }
}
