import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Employee[] list = new Employee[10];
        Random r = new Random();

        for (int i = 0; i < list.length-2; i++ ) {
            list[i] = new Employee("fio",3,r.nextInt(80000));
        }


        printList(list);
        int sum = sumSalaries(list);

        System.out.println("Сумма затрат на зарплату за месяц: " + sum);
        System.out.println("Средняя зарплата сотрудника: " + avgSalary(list));
        System.out.println("Минимальная зарплата сотрудника: " + minSalary(list));
        System.out.println("Максимальная зарплата сотрудника: " + maxSalary(list));

    }

    public static void printList(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println(list[i]);
            }
        }
    }

    public static int sumSalaries(Employee[] list) {

        int total = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                total = list[i].getSalary() + total;
            }
        }
        return total;
    }

    public static int avgSalary(Employee[] list) {
        return sumSalaries(list) / (Employee.getCounter() - 1);
    }
    public static int minSalary(Employee[] list) {
        int min = list[0].getSalary();
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && min > list[i].getSalary()) {
                min = list[i].getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] list) {
        int max = list[0].getSalary();
        for (int i = 0; i < list.length; i++){
            if ( list[i] != null && max < list[i].getSalary()) {
                max = list[i].getSalary();
            }
        }
        return max;
    }



}