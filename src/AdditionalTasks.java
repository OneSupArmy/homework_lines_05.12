public class AdditionalTasks {
    static String fullName = "Ivanov Ivan Ivanovich";
    static String fullNameLowerCase = "ivanov ivan ivanovich";

    public static void main(String[] args) {
        String firstName = separateFullName(fullName)[1];
        String middleName = separateFullName(fullName)[2];
        String lastName = separateFullName(fullName)[0];
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
        System.out.println("\nВерное написание Ф. И. О. сотрудника с заглавных букв — " + upFirstLetters(fullNameLowerCase));
        doShakerShakerBabyMaker();
        findSameLetters();
    }

    //Task 5
    public static String[] separateFullName(String fullName) {
        String[] stringArray = new String[3];
        String fullNameTemp = fullName.trim();
        int firstSpace = fullNameTemp.indexOf(' ');
        int secondSpace = fullNameTemp.lastIndexOf(' ');
        stringArray[0] = (fullNameTemp.substring(0, firstSpace)).trim();
        stringArray[1] = (fullNameTemp.substring(firstSpace, secondSpace)).trim();
        stringArray[2] = (fullNameTemp.substring(secondSpace)).trim();
        return stringArray;
    }

    //Task 6
    public static String upFirstLetters(String fullName) {
        String[] stringArray = separateFullName(fullName);
        char[] tempArrayChar;
        for (int i = 0; i < stringArray.length; i++) {
            tempArrayChar = stringArray[i].toCharArray();
            tempArrayChar[0] = Character.toUpperCase(tempArrayChar[0]);
            stringArray[i] = String.valueOf(tempArrayChar);
        }
        return stringArray[0] + " " + stringArray[1] + " " + stringArray[2];
    }

    //Task 7
    public static void doShakerShakerBabyMaker() {
        StringBuilder firstBuilder = new StringBuilder();
        StringBuilder secondBuilder = new StringBuilder();
        String firstString = "135";//В задании сказано инициализировать 2 строковые
        String secondString = "246";//но можно было наверное и сразу их в объекты классов запихнуть
        firstBuilder.append(firstString);
        secondBuilder.append(secondString);
        try {
            for (int i = 0, j = 1; i < secondString.length(); i++, j += 2) {
                firstBuilder.insert(j, secondBuilder.charAt(i));
            }
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("\nНе знаю, надо ли такое прописывать");
        }
        System.out.println("\n" + firstBuilder);

        //Вариант без StringBuilder (работает)

        /*String firstString = "135";
        String secondString = "246";
        char[] firstChar = firstString.toCharArray();
        char[] secondChar = secondString.toCharArray();
        char[] tempChar = new char[firstChar.length+secondChar.length];
        for (int i = 0, j = 0, k = 0; i < tempChar.length; i++) {
            if (i % 2 == 0){
                tempChar[i] = firstChar[j];
                j++;
            } else {
                tempChar[i] = secondChar[k];
                k++;
            }
        }
        String mergingStrings = String.valueOf(tempChar);
        System.out.println("\n" + mergingStrings);*/
    }
    public static void findSameLetters(){
        String word = "aabccddefgghiijjkk";
        StringBuilder wordInBuilder = new StringBuilder(word);
        for (int i = 0; i < wordInBuilder.length(); i++) {
            for (int j = wordInBuilder.length() - 1; j >=0; j--) {
                if(wordInBuilder.charAt(i) == wordInBuilder.charAt(j) && i!=j){
                    wordInBuilder.deleteCharAt(j);
                }
            }
        }
        System.out.println("\n" + wordInBuilder);
    }
}


