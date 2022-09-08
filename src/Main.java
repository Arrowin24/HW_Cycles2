public class Main {
    public static void main(String[] args) {
        //Task 1.1
        System.out.println("Задание 1.1: ");
        double amount = 2_459_000;
        double salary = 65535;
        double percent = 0.01f;
        double total = 0;
        int j = 0;
        while (total <= amount) {
            j++;
            total += salary + total * percent;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + (int) total + " рублей");
        }

        //Task 1.2
        System.out.println("Задание 1.2: ");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }

        //Task 1.3
        System.out.println("\nЗадание 1.3: ");
        double population = 12_000_000;
        double birthrate = (double) 17 / 1000;
        double mortality = (double) 8 / 1000;
        int k = 0;
        while (k < 10) {
            k++;
            population = population + population * (birthrate - mortality);
            System.out.println("Год " + k + ", численность населения составляет " + (int) population);
        }

        //Task 2.1
        System.out.println("Задание 2.1: ");
        double secondPercent = 0.07;
        double deposit = 15_000;
        int l=0;
        while (deposit<=12_000_000){
            l++;
            deposit +=deposit*secondPercent;
            System.out.println("Месяц " + l + ", сумма накоплений равна " + (int) deposit + " рублей");
        }

        //Task 2.2
        System.out.println("Задание 2.2: ");
        i=0;
        deposit = 15_000;
        while (deposit<=12_000_000){
            i++;
            deposit +=deposit*secondPercent;
            if(i%6==0) System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) deposit + " рублей");
        }

        //Task 2.3
        deposit = 15_000;
        System.out.println("Задание 2.3: ");
        i=0;
        while (i<9*12){
            i++;
            deposit +=deposit*secondPercent;
            if(i%6==0) System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) deposit + " рублей");
        }

        //Task 2.4
        System.out.println("Задание 2.4: ");
        int friday =2;
        while (friday<=31){
            System.out.println("Сегодня пятница "+friday+"-е число. Необходимо подготовить отчет.");
            friday+=7;
        }

        //Task 3.1
        System.out.println("Задание 3.1: ");
        int year = 1822;
        int lastYear = 2122;
        while (year<lastYear){
            if(year%79==0) System.out.println(year);
            year++;
        }

        //Task 3.2
        System.out.println("Задание 3.2: ");
        for(i=1;i<=10;i++){
            System.out.println("2*"+i+"="+i*2);
        }
    }
}