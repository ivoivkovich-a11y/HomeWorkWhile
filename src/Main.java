public class Main {
    public static void main(String[] args) {
    System.out.println("Задание №1");
    int firstFriday = 3;
    int day;
    for ( day = 1; day <= 31; day ++) {
        if (day == firstFriday) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет ");
            firstFriday = firstFriday + 7;
        }
    }
    System.out.println("Задание №2");
    System.out.println("Вариант №1");
    int distance = 0;
    int finush = 42195;
    do {
        distance = distance + 500;
        if (distance > finush) {
            break;
        } else {
            System.out.println("Держитесь! Осталось " + (finush - distance) + " метров");
        }
    }
    while (distance <= finush);
    System.out.println("Задание №2");
    System.out.println("Вариант №2");
    int distance1 = 0;
    int finish1 = 42195;
    for (; distance1 <= finish1 ; distance1 += 500) {
        System.out.println("Держитесь! Осталось " + (finish1 - distance1) + " метров");
    }

    System.out.println("Задание №3");
    System.out.println("Вариант №1");
    int money = 500;
    int count = 0;
    while (money > 0){
        count = count +1;
        if (count % 5 == 0) {
            continue;
        } if (count % 5 != 0){
            money = money - 100;
        }
    }
    System.out.println("Бюджета хватит на " + count + " дней");
    System.out.println("Задание №3");
    System.out.println("Вариант №2");
    int money1 = 1500;
    int count1 = 0;
    for (; money1 > 0; money1 -= 100){
        count1 = count1 + 1;
        if (count1 % 5 == 0){
            count1 = count1 + 1;
            continue;
        } if (count1 % 5 !=0){
        }
    }
    System.out.println("Бюджета хватит на " + count1 + " дней");
    System.out.println("Задание №4");
    int month = 0;
    int total = 0;
    int selary = 15_000;
    while (true) {
        total = total + selary;
        month = month + 1;
        if (total < 12_000_000 && month % 6 != 0) {
            System.out.println("Через " + month + " месяцев сумма будет "+ total);
        }if (total < 12_000_000 && month % 6 == 0) {
            total = total + (total/100*7);
            System.out.println("Через " + month + " месяцев сумма будет "+ total);
        }if (total >= 12_000_000){
            break;
        }
    }
    System.out.println("Задание №5");
    int charge = 20;
    int minute = 0;
    int overheats = 0;
    while (charge < 100 && overheats <= 3){
        minute = minute + 1;
        if (overheats != 3){
            if (minute % 10 == 0){
                overheats = overheats + 1;
                minute = minute + 2;
                continue;
            }if (minute % 10 != 0){
                charge = charge + 2;
            }
        }if (overheats == 3) {
            System.out.println("Остановка зарядки");
            break;
        }
    }
    System.out.println("Время зарядки составило " + minute + " минут");
}
}

