package Work;

import org.w3c.dom.ls.LSOutput;

import static Work.Start.*;
import static Work.Array_Download.*;

public class Print_Messages {                                                                                            // Для удобства сделал класс, где хранятся все сообшения
    public static void printMessage(String message) {

        switch (message) {
            case "input":
                System.out.println("\nВведите символ: ");                                                                // Просим ввести символ
                break;

           case "start":
                System.out.println("\nВы хотите начать новую игру?\n1.Да (Начать игру)\n2.Нет (Выход)\nВведите Ваш ответ (цифрами 1 или 2):");
                                                                                                                        // печатаем номер слова - нужно было для тестирования
                break;

            case "current_turn":
                System.out.println("\nСЛОВО: "+ result);                                                                 // печатаем текущее состояние слова
                System.out.println("Количество ошибок: "+ countMistakes+" из "+ maxMistakes+" возможнных.");             // даем информацию по количеству ошибок
                break;

            case "error":
                System.out.println("\nВы не угадали букву.");
                break;

            case "win":
                System.out.println("\nВЫ ПОБЕДИЛИ!\nВы угадали слово: "+ result);                                        // сообщение о победе
                break;

            case "lose":
                System.out.println("\nВЫ ПРОИГРАЛИ!\nВы не угадали слово: "+ word.get(random));                          // сообщение о поражении
                break;
            case "not_russian_letter":
                System.out.println("\nВ игре используются только русские слова. Введите пожалуйста русскую букву");      // неверный символ
                break;
            case "not_number":
                System.out.println("Введите Ваш ответ (цифрами 1 или 2): ");
                break;
            case "single_char_required":
                System.out.println("Пожалуйста, введите ровно один символ.");                                            // введено символов больше 1
                break;
            case "game_over":
                System.out.println("Конец игры.");
                break;
        }

    }
}
