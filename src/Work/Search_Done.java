package Work;

import static Work.Start.*;

public class Search_Done {

    public static boolean wordSearchIsDone() {             // метод проверяющий, закончили ли мы отгадывать слово. Если да - true. Считаем по звездочкам в переменной return

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '*')                   // метод считает количество * в слове, которое выводится пользователю
                return false;
        }
        return true;
    }
}
