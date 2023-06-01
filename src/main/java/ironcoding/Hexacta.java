package ironcoding;

public class Hexacta {

    public static void main(String[] args) {
        System.out.println("Detectar palabras palindromas");

        String one = "neuquen";
        String two = "neuquen";
        boolean palindrom = true;

        if (one.length() != two.length()) {
            System.out.println(" No son ");
        }

        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != two.charAt(one.length() - 1 - i)) {
                System.out.println(" No son ");
                palindrom = false;
                break;
            }
        }

        if(palindrom){
            System.out.println("Son palindromas");
        }


    }
}