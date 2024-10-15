import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Жабьи глаза");
        int toadEyesCount = new Scanner(System.in).nextInt();           //Жабьи глаза
        System.out.println("Слезы вурдалака");
        int ghoulTearsCount = new Scanner(System.in).nextInt();        //Слезы вурдалака
        System.out.println("Кости ворона");
        int ravenBonesCount = new Scanner(System.in).nextInt();        //Кости ворона
        System.out.println("Пельмени(а почему, собственно нет? xD )");
        int dumplingsCount = new Scanner(System.in).nextInt();         //Пельмени(а почему, собственно нет? xD )


        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир
        boolean i = false;

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Эликсир зоркости");
            i = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Эликсир стойкости");
            i = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Эликсир скрытности");
            i = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Запретный эликсир");
            i = true;
        }
        if (!i){
            System.out.println("Эликсир не найден");
        }
    }
}
