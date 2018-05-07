package IQuestions;

public class FirstLetterInCaps {

    public static void main(String[] args) {
        //Given a String "hello java", print the words as "Hello Java"
        String input = "hello , 123    Iam going java";

        String[] myStrings = input.split("\\s+");//whitespace \\s-1 ws, \\s+ - more than 1 ws
        for (String word : myStrings) {

            System.out.print(firstLetterCapital(word) + " ");
        }

    }

    public static String firstLetterCapital(String word) {

        return word.substring(0, 1).toUpperCase() + word.substring(1);

    }
}
// 1. \\ss matches a single whitespace, \\ss+ matches one or many white spaces. 
//They're the so-called regular expression quantifiers