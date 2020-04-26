public class StringOperations {
    public static void main(String[] args) {
        String inputString = "teeter";
        String replace = "";
//Option 1
        int length = inputString.length();
        for (int i = 0; i < length; i++) {
            replace = replace.substring(0, i) + inputString.charAt(length - i - 1);
        }
        System.out.println(inputString);
        System.out.println(replace);
//Option 2
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }

        char uniqueCharacter = '#';
        char searchSymbol;
        for (int i = 0; i < length; i++) {
            searchSymbol = inputString.charAt(i);

            int firstIndex = inputString.indexOf(searchSymbol);
            int lastIndex = inputString.lastIndexOf(searchSymbol);

            if (firstIndex == lastIndex) {
                uniqueCharacter = inputString.charAt(i);
                break;
            }
        }
        System.out.println("First unique character:" + uniqueCharacter);
    }
}