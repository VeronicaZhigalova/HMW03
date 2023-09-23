public class HomeWork3 {
    public static int calculateAbsoluteDifference(int a, int b) {
       return (-1) * (a - b);
    }




    public char getFirstChar(String string) {
        return string.charAt(0);
    }

    public char getLastChar(String string) {
        return string.charAt(string.length() - 1);
    }


    public String swapFirstAndLastCharacters(String string) {
        return getLastChar(string) + string.substring(1, string.length() - 1) + getFirstChar(string);

    }

    public static void main(String[] args) {
        int calculateAbsoluteDifference = calculateAbsoluteDifference(-8, 7);
        HomeWork4 homework = new HomeWork4();
        char firstChar = homework.getFirstChar("Python");
        char lastChar = homework.getLastChar("Python");
        System.out.println(firstChar);
        System.out.println(lastChar);
        String swappedString = homework.swapFirstAndLastCharacters("Python");
        System.out.println(swappedString);
        System.out.println(calculateAbsoluteDifference);
    }

}


