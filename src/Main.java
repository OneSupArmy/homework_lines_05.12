

public class Main {
    static String firstName = "Ivan";
    static String middleName = "Ivanovich";
    static String lastName = "Ivanov";

    public static void main(String[] args) {
        String fullName = getFullName(firstName, middleName, lastName);
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("\nДанные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());//Task 2
        System.out.println("\n" + getFullNameExceptSymbols());
    }
    //Task 1
    public static String getFullName(String firstName, String middleName, String lastName) {
        return lastName + " " + firstName + " " + middleName;
    }
    //Task 3
    public static String getFullNameExceptSymbols() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        return getFullName(firstName,middleName,lastName).replace("ё","e");
    }
}