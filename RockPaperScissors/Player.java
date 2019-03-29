import java.util.Scanner;

class Player{
    String Var = ""; //Переменная ответа (Сокращение от VARIANT)
    void player_var(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the answer: ");
        String Var_no_up = input.nextLine();    //Ввод с клавиатуры в переменную,
                                                //для дальнейшего поднятия регистра
        char[] chars = Var_no_up.toCharArray();
        String str = "";
        for (char c : chars) {                  //Собственно поднятие регистра
            c = Character.toUpperCase(c);
            str += c;
        }
        Var = str;
    }
}