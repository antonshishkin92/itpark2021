package lesson8;

public class CatRunner {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.name="Барсик";
        barsik.age=1;
        barsik.poroda="Сибирский";
        barsik.bossName="Антон";
        Cat persik = new Cat();
        persik.name="Персик";
        persik.age=4;
        persik.poroda="Персидский";
        persik.bossName="Сергей";
        Cat bobik = new Cat();
        Cat malysh = new Cat();
        System.out.println(barsik == persik);
        System.out.println(barsik == bobik);
        System.out.println(barsik == malysh);
        System.out.println("--------------------");
        System.out.println(barsik.equals(persik));
    }
}
