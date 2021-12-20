package lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionOfSphetaphore("желтый"));
        System.out.println(getSolutionOfSphetaphore("зеленый"));
        System.out.println(getSolutionOfSphetaphore("красный"));

    }


    public static String getSolutionOfSphetaphore(String color) {
        String result;

        switch (color) {
            case "красный": {
                result= "Проход запрещен";
                break;
            }
            case "желтый": {
                result= "Будь внимателен";
                break;
            }
            case "зеленый": {
                result= "Проход разрещен";
                break;
            }
            default:{
                result = "";
                break;
            }
        }
        return result;
    }
}
