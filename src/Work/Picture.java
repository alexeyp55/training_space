package Work;

public class Picture {                                                          // класс отрисовки виселицы
    public static void pictureDraw(int i){
        switch (i) {
            case 0:
                System.out.println("   ______\n" +
                        "   |     |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "**********");
                break;
            case 1:
                System.out.println("   ______\n" +
                        "   |     |\n" +
                        "   o     |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "**********");
                break;
            case 2:
                System.out.println("   ______\n" +
                        "   |     |\n" +
                        "   o     |\n" +
                        "   |     |\n" +
                        "         |\n" +
                        "         |\n" +
                        "**********");
                break;
            case 3:
                System.out.println("   ______\n" +
                        "   |     |\n" +
                        "   o     |\n" +
                        "  /|     |\n" +
                        "         |\n" +
                        "         |\n" +
                        "**********");
                break;
            case 4:
                System.out.println("   ______\n" +
                        "   |     |\n" +
                        "   o     |\n" +
                        "  /|\\    |\n" +
                        "         |\n" +
                        "         |\n" +
                        "**********");
                break;
            case 5:
                System.out.println("   ______\n" +
                        "   |     |\n" +
                        "   o     |\n" +
                        "  /|\\    |\n" +
                        "   /     |\n" +
                        "         |\n" +
                        "**********");
                break;
            case 6:
                System.out.println("  ______\n" +
                        "   |     |\n" +
                        "   o     |\n" +
                        "  /|\\    |\n" +
                        "   /\\    |\n" +
                        "         |\n" +
                        "**********");
        }
    }
}
