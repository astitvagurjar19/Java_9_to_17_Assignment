public class Question10 {
    public static void main(String[] args) {
        String string = "\n\t Welcome to TO THE NEW.";
        System.out.println(string.repeat(2));
        System.out.println(string.strip());
        System.out.println(string.isBlank());
        System.out.println(string.indent(1));
        String transformString=string.transform(s -> new StringBuilder(string).reverse().toString());
        System.out.println(transformString);
        System.out.println(string.stripIndent());
        System.out.println(string.translateEscapes());
        int year=2022;
        String formattedString=String.format("To the new batch %d",year);
        System.out.println(formattedString);
    }
}