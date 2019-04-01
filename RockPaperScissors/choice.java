import java.util.Scanner;
import java.io.IOException;

class choice{
    static void tipocls(){
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }
    }
    static void print_choice(){
        tipocls();
        System.out.flush();  
        System.out.println("Выберите игру:");
        System.out.println("1 - Камень ножницы бумага");
        System.out.println("2 - Морской бой");
        System.out.println("Quit - Выйти из меню выбора");
    }
    static String input_var(){
        Scanner input = new Scanner(System.in);
        String Var_no_up = input.nextLine();    //Ввод с клавиатуры в переменную,
                                                //для дальнейшего поднятия регистра
        char[] chars = Var_no_up.toCharArray();
        String str = "";
        for (char c : chars) {                  //Собственно поднятие регистра
            c = Character.toUpperCase(c);
            str += c;
        }
        return str;
    }
    public static void main(String[] args) {
        Boolean triger = true;
        while (triger){
            print_choice();
            String var = input_var();
            if (var.equals("1")){
                tipocls();
                Game RPS = new Game();
                RPS.startgame();
            }
            else if (var.equals("2")){
                tipocls();
                DotComGame DCG = new DotComGame();
                DCG.boystart();
            }
            else if (var.equals("QUIT")){
                triger = false;
            }
            else{
                tipocls();
                System.out.println("Введено некоректное значение");
            }
        }

    }
}