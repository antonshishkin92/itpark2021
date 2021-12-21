package lesson7;

public class HumanRunner {
    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Anton";
        me.surname = "Shishkin";
        me.age = 29;
        me.height = 1.85;
        me.weight = 69;
        me.hasQrcode = true;

        Human AlexeiShishkin = new Human();
        AlexeiShishkin.name = "Alexei";
        AlexeiShishkin.surname = "Shishkin";
        AlexeiShishkin.age = 50;
        AlexeiShishkin.weight = 92;
        AlexeiShishkin.height = 1.88;
        AlexeiShishkin.hasQrcode = false;

        Human incognito= new Human("Unknown","Unknown",-1,-1,-1,null);

        Human vasyaPupkin = new Human("Vasiliy","Pupkin",36,-1,-1,null);
        System.out.println(me==vasyaPupkin);
        System.out.println(me==me);


        Human[] humans=new Human[]{me,AlexeiShishkin,incognito,vasyaPupkin};
        for (Human human:humans){
            if (Integer.valueOf(50).equals(human.age)){
                System.out.println("Человек с именем " +human.name + " и фамилия " + human.surname + " имеет возраст 50!");
            }
        }

        me.beOlder();
        System.out.println("Мне исполнится в следующем году " + me.age);
        me.vaccinated();
        System.out.println("Наличие QR кода " + me.hasQrcode);


    }
}
