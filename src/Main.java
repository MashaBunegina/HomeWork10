public class Main {
    public static void main(String[] args) {

        String firstName = " ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = lastName + firstName + middleName;
        String fullName1 = fullName.toUpperCase();

        System.out.println("Ф.И.О сотрудника" + fullName);
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета" + fullName1);


        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф.И.О сотрудника - " + fullName3);
    }
}

