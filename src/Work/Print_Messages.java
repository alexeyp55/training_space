package Work;

import org.w3c.dom.ls.LSOutput;

import static Work.Start.*;
import static Work.Array_Download.*;

public class Print_Messages {
    public static void printMessage(String message) {

        switch (message) {
            case "input":
                System.out.println("\nВведите символ: ");                                                                 // Просим ввести символ
                break;

            case "start":
                System.out.println("\nВы пытаетесь отгадать " + (random+1) + "-ое слово из массива");                     // печатаем номер слова
                break;

            case "current_turn":
                System.out.println("\nСЛОВО: "+ result);                                                                   // печатаем текущее состояние слова
                System.out.println("Количество ошибок: "+ countMistakes+" из "+ maxMistakes+" возможнных.");               // даем информацию по количеству ошибок
                break;

            case "error":
                System.out.println("\nВы не угадали букву.");
                break;

            case "win":
                System.out.println("\nВЫ ПОБЕДИЛИ!\nВы угадали слово: "+ result);                                          // сообщение о победе
                break;

            case "lose":
                System.out.println("\nВЫ ПРОИГРАЛИ!\nВы не угадали слово: "+ word[random]);                                // сообщение о поражении
                break;
            case "not_russian_letter":
                System.out.println("\nВ игре используются только русские слова. Введите пожалуйста русскую букву");        // неверный символ
                break;
            case "single_char_required":
                System.out.println("Пожалуйста, введите ровно один символ.");                                              // введено символов больше 1
                break;

        }

    }
}
