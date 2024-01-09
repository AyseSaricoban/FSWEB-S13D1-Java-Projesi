public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("--------------------------------------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("--------------------------------------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("--------------------------------------------");


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay <= 23) {
                return (hourOfDay < 8 || hourOfDay >= 20);
            }
        }
        return false;
    }
     public static boolean hasTeen (int num1, int num2, int num3) {
         return (num1>=13 && num1<=19) || (num2>=13 && num2<=19) ||(num3>=13 && num3<=19);
     }
    public static boolean isTeen(int... ages) {

        for (int age:ages){
            if (age >= 13 && age<=19){
                return true;
            }
        }
        return false;
    }
    public static boolean isCatPlaying (boolean isSummer, int  temperature) {
        if (isSummer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

}
