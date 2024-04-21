//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int dirtyLevel = 3;
        boolean isDelicate = false;
        int clothesWeight = 4;
        String washingMode;

        if(dirtyLevel >= 4) {
            if(isDelicate) {
                washingMode = "Деликатный";
            } else {
                washingMode = "Стандартный";
            }
            } else if (clothesWeight > 5) {
                washingMode = "Большая загрузка";
            } else { washingMode = "Сильные загрязнения";
                            }

        System.out.println("Выбран режим стирки: " + washingMode + ".");
    }
    }