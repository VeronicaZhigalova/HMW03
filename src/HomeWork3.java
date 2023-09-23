public class HomeWork3 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 9;
        int result = (number1 - number2);
        if (result > 0) {
            System.out.print(result);
        } else {
            System.out.println(-1 * result);

        }

    }

}
class Letter2 {
    public static void main(String[] args) {

        String text = "Python";
        char a = text.charAt(0);
        System.out.println(a);
        char b = text.charAt(text.length() - 1);
        System.out.println(b);

    }

}


class Word2 {
    public static String swapFirstAndLast(String str) {
        if (str.length() < 2)
            return str;

        char[] ch = str.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;

        return String.valueOf(ch);
    }

    public static void main(String args[]) {

        String str = "Python";
        System.out.println(swapFirstAndLast(str));
    }
}

