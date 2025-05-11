package Work;

import java.io.FileNotFoundException;
import static Work.Array_Download.*;
import static Work.Start.*;
import static Work.Search_Done.*;
import static Work.Find_Letter.*;
import static Work.Print_Messages.*;

public class Game {                                                                 // основной движок игры - начало и завершение происходит тут
    public static boolean gameGoing = true;                                         // переменная, индикатор для начала игры

    public static void main(String[] args) throws FileNotFoundException {
        arrayDownload();                                                            // загружаем массив данных

        while (gameGoing == true) {                                                 // цикл, который сработает хотя бы один раз - зацикливает всю игру, включая выбор пользователя
            startGame();                                                            // спрашиваем пользователя - начать да/нет, инициализируем глобальные переменные

            if (gameGoing == true) {                                                        // проверяем ответ пользователя для начала игры
                while ((countMistakes < maxMistakes) & (!wordSearchIsDone())) {             // игровой цикл, работающий до maxMistakes ошибок или до победы
                    searchingWord();
                }
                if (wordSearchIsDone())
                    printMessage("win");
                else
                    printMessage("lose");
            }
        }
        printMessage("game_over");                                                  // печатаем игра окончена
    }
}