package Work;

import java.util.Scanner;
import static Work.Print_Messages.*;

public class InputNumber {                                                                 // класс, для проверки пользователем цифр 1 или 2 для начала игры

    public static int inputCharNumber() {                                                  // метод, для ввода буквы пользователем
        Scanner scanner = new Scanner(System.in);
        char symbol;

        while (true){                                                                       // бесконечный цикл, который прерывается только командами break при выполнении условий
            String input = scanner.next();                                                  // создаем переменную string для хранения ввода и проверки его на условия ниже

            if (input.length() == 1) {                                                      // проверяем длину строки input, если больше 1 - будет сообщение о количестве символов
                symbol = input.charAt(0);                                                   // если длина 1 - запоминаем ввод в symbol;

                if (isItNumber(symbol)) {
                    break;
                }
                else {
                    printMessage("not_number");                                             // пишем сообщение, что введена не цифра
                }
            }
            else {
                printMessage("single_char_required");
            }
        }
        return Character.getNumericValue(symbol);
    }

            private static boolean isItNumber(char c) {                                             // Проверяем, что символ - цифра
                return ((c == '1') || (c == '2'));
            }
}
