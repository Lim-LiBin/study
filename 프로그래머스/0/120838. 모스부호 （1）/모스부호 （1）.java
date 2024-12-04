class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] letterArr = letter.split(" ");
        
        for(int i = 0; i < letterArr.length; i++) {
            answer += letter_code(letterArr[i]);
        }
        
        return answer;
    }
    
    static String letter_code(String letter) {
        if (letter.equals(".-")) return "a";
        else if (letter.equals("-...")) return "b";
        else if (letter.equals("-.-.")) return "c";
        else if (letter.equals("-..")) return "d";
        else if (letter.equals(".")) return "e";
        else if (letter.equals("..-.")) return "f";
        else if (letter.equals("--.")) return "g";
        else if (letter.equals("....")) return "h";
        else if (letter.equals("..")) return "i";
        else if (letter.equals(".---")) return "j";
        else if (letter.equals("-.-")) return "k";
        else if (letter.equals(".-..")) return "l";
        else if (letter.equals("--")) return "m";
        else if (letter.equals("-.")) return "n";
        else if (letter.equals("---")) return "o";
        else if (letter.equals(".--.")) return "p";
        else if (letter.equals("--.-")) return "q";
        else if (letter.equals(".-.")) return "r";
        else if (letter.equals("...")) return "s";
        else if (letter.equals("-")) return "t";
        else if (letter.equals("..-")) return "u";
        else if (letter.equals("...-")) return "v";
        else if (letter.equals(".--")) return "w";
        else if (letter.equals("-..-")) return "x";
        else if (letter.equals("-.--")) return "y";
        else if (letter.equals("--..")) return "z";
        
        return "";
    }
}
