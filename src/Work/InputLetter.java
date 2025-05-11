package Work;

import java.util.Scanner;
import static Work.Print_Messages.*;

public class InputLetter {

    public static char inputChar() {                                                        // метод, для ввода буквы пользователем во время основной игры
        Scanner scanner = new Scanner(System.in);
        char symbol;

        while (true){                                                                       // бесконечный цикл, который прерывается только командами break при выполнении условий
            printMessage("input");                                                          // Просим ввести символ
            String input = scanner.next();                                                  // создаем переменную string для хранения ввода и проверки его на условия ниже

            if (input.length() == 1) {                                                      // проверяем длину строки input
                symbol = input.charAt(0);                                                   // если длина 1 - запоминаем ввод в symbol;

                if (isRussianLetter(symbol)) {
                    break;
                }
                else {
                    printMessage("not_russian_letter");                                     // пишем сообщение, что введена не русская буква
                }
            }
            else {
                printMessage("single_char_required");
            }
        }
        symbol = Character.toLowerCase(symbol);                                             // приводим символ к одному регистру
        return symbol;
    }

    private static boolean isRussianLetter(char c) {                                        // Проверяем, что символ - русская буква (строчная или заглавная)
        return (c >= 'А' && c <= 'Я') || (c >= 'а' && c <= 'я') || c == 'Ё' || c == 'ё';
    }
}