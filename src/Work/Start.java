package Work;


public class Start {                                              // класс для инициализации публичных переменных и выбора слова для отгадывания из массива

    public static int countMistakes = 0;                          // сбрасываем счетчик ошибок
    public static final int maxMistakes = 3;                      // задаем максимальное количество ошибок
    public static String result="";                               // переменная, для формирования строки, для отображения пользователю
    public static int random = (int) (Math.random()*3);           // берем рандомное слово из массива


    public static void startGame() {
        Print_Messages.printMessage("start");                          // печатаем номер слова

        for (int i = 0; i< Array_Download.word[random].length(); i++){     // формируем слово состоящее из *, c количеством символов как в слове, которое мы ищем
            result = result + "*";
        }
    }
}
