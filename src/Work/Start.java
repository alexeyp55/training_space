package Work;

import static Work.Array_Download.*;
import static Work.Print_Messages.*;
import static Work.InputNumber.*;
import static Work.Game.*;
import static Work.Picture.*;


public class Start {                                              // стартовый класс, задает вопрос пользователю про начало игры и инициализирует глобальные переменные

    public static int countMistakes;                              // сбрасываем счетчик ошибок
    public static final int maxMistakes = 6;                      // задаем максимальное количество ошибок
    public static String result;                                  // переменная, для формирования строки, для отображения пользователю
    public static int random;


    public static void startGame() {

        int answer = 1;                                           // переменная, для определения ответа пользователя - начать игру или нет
        result = "";                                              // Обнуляем переменную result
        countMistakes = 0;                                        // обнуляем счетчик ошибок
        random = (int) (Math.random()*word.size());               // берем рандомное слово из массива
        printMessage("start");                                    // спрашиваем пользователя - начнем игру?
        answer = inputCharNumber();                               // смотрим его ответ

        if (answer == 1){
            for (int i = 0; i< word.get(random).length(); i++){       // формируем слово состоящее из *, c количеством символов как в слове, которое мы ищем
                result = result + "*";
            }
            printMessage("current_turn");                             // печатаем информацию для первого хода
            pictureDraw(countMistakes);                               // рисуем базовую виселицу
            gameGoing = true;                                         // пользователь выбрал ответ 1 - значит играем
        }
        else {
            gameGoing = false;                                        // значит пользователь выбрал ответ - 2, заканчиваем игру
        }

    }
}
