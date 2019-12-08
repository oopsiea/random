/*
ECE150 Fall2019

Final Project: Morse Code En/Decoder

4 inputs:
dot (.) = 1
dash (-) = 11
signal spacing () = 0
letter spacing (_) = 000
space (----) = 0000000

TEST CASE:
..-._..-_-.-._-.-_-----.-._---_---_.--._._.-._
FUCK COOPER 
FUCK COOPER
..-._..-_-.-._-.-_----_-.-._---_---_.--._._.-._
 */

import java.util.Scanner;

public class Morse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // decoder
        String codes = scanner.nextLine();
        String[] words = codes.split("----");
        String[] alphabets;
//        String[] letters = new String[100];
        int size = 0;
        int k;
        MorseCode temp;
        for (int i = 0; i < words.length; i++) {
            alphabets = words[i].split("_");
            k = words[i].split("_").length;
            for (int j = 0; j < k; j++) {
                temp = new MorseCode(alphabets[j]);
                System.out.print(temp.getLetter());
            }
            System.out.print(" ");
        }
        System.out.println();

        //encoder
        String sentence = scanner.nextLine();
        char[] letters = sentence.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            temp = new MorseCode(letters[i]);
            System.out.print(temp.getCode() + "_");
        }


    }


    public static class MorseCode {
        private char letter;
        private int binary;
        private String code;

        MorseCode(char letter) {
            this.letter = letter;
        }

        MorseCode(String code) {
            this.code = code;
        }

        public String getCode() {
            switch (this.letter) {
                case ' ':
                    code = "----";
                    break;
                case 'A':
                    code = ".-";
                    break;
                case 'B':
                    code = "-...";
                    break;
                case 'C':
                    code = "-.-.";
                    break;
                case 'D':
                    code = "-..";
                    break;
                case 'E':
                    code = ".";
                    break;
                case 'F':
                    code = "..-.";
                    break;
                case 'G':
                    code = "--.";
                    break;
                case 'H':
                    code = "....";
                    break;
                case 'I':
                    code = "..";
                    break;
                case 'J':
                    code = ".---";
                    break;
                case 'K':
                    code = "-.-";
                    break;
                case 'L':
                    code = ".-..";
                    break;
                case 'M':
                    code = "--";
                    break;
                case 'N':
                    code = "-.";
                    break;
                case 'O':
                    code = "---";
                    break;
                case 'P':
                    code = ".--.";
                    break;
                case 'Q':
                    code = "--.-";
                    break;
                case 'R':
                    code = ".-.";
                    break;
                case 'S':
                    code = "...";
                    break;
                case 'T':
                    code = "-";
                    break;
                case 'U':
                    code = "..-";
                    break;
                case 'V':
                    code = "...-";
                    break;
                case 'W':
                    code = ".--";
                    break;
                case 'X':
                    code = "-..-";
                    break;
                case 'Y':
                    code = "-.--";
                    break;
                case 'Z':
                    code = "--..";
                    break;
                default:
                    break;
            }
            return code;
        }

        public char getLetter() {
            switch (this.code) {
                case ".-":
                    letter = 'A';
                    break;
                case "-...":
                    letter = 'B';
                    break;
                case "-.-.":
                    letter = 'C';
                    break;
                case "-..":
                    letter = 'D';
                    break;
                case ".":
                    letter = 'E';
                    break;
                case "..-.":
                    letter = 'F';
                    break;
                case "--.":
                    letter = 'G';
                    break;
                case "....":
                    letter = 'H';
                    break;
                case "..":
                    letter = 'I';
                    break;
                case ".---":
                    letter = 'J';
                    break;
                case "-.-":
                    letter = 'K';
                    break;
                case ".-..":
                    letter = 'L';
                    break;
                case "--":
                    letter = 'M';
                    break;
                case "-.":
                    letter = 'N';
                    break;
                case "---":
                    letter = 'O';
                    break;
                case ".--.":
                    letter = 'P';
                    break;
                case "--.-":
                    letter = 'Q';
                    break;
                case ".-.":
                    letter = 'R';
                    break;
                case "...":
                    letter = 'S';
                    break;
                case "-":
                    letter = 'T';
                    break;
                case "..-":
                    letter = 'U';
                    break;
                case "...-":
                    letter = 'V';
                    break;
                case ".--":
                    letter = 'W';
                    break;
                case "-..-":
                    letter = 'X';
                    break;
                case "-.--":
                    letter = 'Y';
                    break;
                case "--..":
                    letter = 'Z';
                    break;
                default:
                    break;
            }
            return letter;
        }

        public int getBinary() {
            switch (code) {
                case ".-":
                    binary = 0b1011;
                case "-...":
                    binary = 0b11010101;
                case "-.-.":
                    binary = 0b110101101;
                case "-..":
                    binary = 0b110101;
                case ".":
                    binary = 0b1;
                case "..-.":
                    binary = 0b10101101;
                case "--.":
                    binary = 0b1101101;
                case "....":
                    binary = 0b1010101;
                case "..":
                    binary = 0b101;
                case ".---":
                    binary = 0b1011011011;
                case "-.-":
                    binary = 0b1101011;
                case ".-..":
                    binary = 0b10110101;
                case "--":
                    binary = 0b11011;
                case "-.":
                    binary = 0b1101;
                case "---":
                    binary = 0b11011011;
                case ".--.":
                    binary = 0b101101101;
                case "--.-":
                    binary = 0b1101101011;
                case ".-.":
                    binary = 0b101101;
                case "...":
                    binary = 0b10101;
                case "-":
                    binary = 0b1;
                case "..-":
                    binary = 0b101011;
                case "...-":
                    binary = 0b10101011;
                case ".--":
                    binary = 0b1011011;
                case "-..-":
                    binary = 0b110101011;
                case "-.--":
                    binary = 0b1101011011;
                case "--..":
                    binary = 0b110110101;
            }
            return binary;
        }
    }
}
