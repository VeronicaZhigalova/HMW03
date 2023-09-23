class Letter {
    public static void main(String[] args) {

        String text = "Python";
        char a = text.charAt(0);
        System.out.println(a);
        char b = text.charAt(text.length() - 1);
        System.out.println(b);

    }

}


class Word {
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

