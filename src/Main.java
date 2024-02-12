public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 21;
        if (age < 18) {
            System.out.println("Вам ещё не исполнилось 18! Стоит немного подождать");
        } else {
            System.out.println("Вы уже достигли совершеннолетия!");
        }

        System.out.println("Задача 2");
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Задача 3");
        int km = 60;
        if (km <= 60) {
            System.out.println("Если скорость " + km + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + km + ", то придется заплатить штраф");
        }

        System.out.println("Задача 4");
        int personAge = 63;
        if (personAge > 2 && personAge <= 6){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        }
        if (personAge > 7 && personAge < 17){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        }
        if (personAge >= 18 && personAge <= 24){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
        }

        System.out.println("Задача 5");
        int childAge = 9;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен" + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно самостоятельно кататься на аттракционе");
        }

        System.out.println("Задача 6");
        int peopleInСarriage = 3;
        if (peopleInСarriage <= 60) {
            System.out.println("Для " + peopleInСarriage + " пассажира есть сидячее место в вагоне");
        }
        else if (peopleInСarriage > 60 && peopleInСarriage <= 102) {
            System.out.println("Для " + peopleInСarriage + " пассажира есть место в вагоне, но прийдется постоять");
        }
        else if (peopleInСarriage > 120) {
            System.out.println("Для " + peopleInСarriage + " пассажира места в вагоне нет");
        }

        System.out.println("Задача 7");
        int one = 3;
        int two = 1;
        int three = 5;
        boolean oneBiggest = one > two && one > three;
        boolean twoBiggest = two > one && two > three;
        if (oneBiggest) {
            System.out.println("Число один — наибольшее из всех.");
        }
        else if (twoBiggest) {
            System.out.println("Число два — наибольшее из всех.");
        } else {
            System.out.println("Число три — наибольшее из всех.");
        }
    }
    }



