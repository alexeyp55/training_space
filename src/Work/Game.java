package Work;

import java.io.FileNotFoundException;
import static Work.Array_Download.*;
import static Work.Start.*;
import static Work.Search_Done.*;
import static Work.Find_Letter.*;
import static Work.Print_Messages.*;

public class Game {
    public static void main(String[] args) throws FileNotFoundException {
        arrayDownload();                                                            // загружаем массив данных
        startGame();                                                                // инициализируем стартовые глобальные переменные, формируем слово

        while ((countMistakes < maxMistakes) & (!wordSearchIsDone())) {             // цикл отгадаывания букв, работающий до maxMistakes ошибок или до победы
             searchingWord();
         }
         if (wordSearchIsDone())
             printMessage("win");
          else
              printMessage("lose");

    }
}