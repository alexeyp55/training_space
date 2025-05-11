package Work;

import static Work.Start.*;
import static Work.Array_Download.*;
import static Work.Print_Messages.*;
import static Work.Picture.*;
import static Work.InputLetter.*;


public class Find_Letter {                                              // класс, занимающийся поиском буквы в слове. также пишет промежуточные итоги пользователю


    public static void searchingWord () {
        boolean isFinded = false;                                       // переменная булеан, нужна для маркера - была ли найдена буква в текущем цикле
        char character;                                                 // переменная для хранения символа
        StringBuilder sb = new StringBuilder(result);                   // создаем объект сб для работы со строкой result
        character = inputChar();

        for (int i = 0; i< result.length(); i++) {                      // цикл, для перебирания букв в слове
            if (word.get(random).charAt(i) == character) {              // проверяем, равно ли i-ая буква нашему выбранному символу
                sb.setCharAt(i, Character.toUpperCase(character));      // если да, меняем в ней i-ый символ на character
                isFinded = true;
            }
        }
        result = sb.toString();


        if (!isFinded) {                                                // если ни одной буквы не было найдено, то добавляем ошибку и печатаем сообщение пользователю
            countMistakes++;
            printMessage("error");                                      // печатаем сообщение, что ошиблись с буквой
            printMessage("current_turn");                               // печатаем информацию по количеству ошибок и печатаем текущий вид слова
            pictureDraw(countMistakes);                                 // рисуем виселицу, в зависимости от количества ошибок
        }
        else {
            printMessage("current_turn");                               // печатаем информацию по количеству ошибок и печатаем текущий вид слова
            pictureDraw(countMistakes);                                 // рисуем виселицу, в зависимости от количества ошибок
        }
    }

}