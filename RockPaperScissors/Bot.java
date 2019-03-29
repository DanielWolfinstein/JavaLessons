import java.util.Random;

class Bot{
    String Vatiant = ""; 
    static int Num_Var_dub = -1;
	static int Num_Var = -1;
    static Random random = new Random();
    
    static void no_dub(){
        while (Num_Var == Num_Var_dub){
            Num_Var = random.nextInt(3);
        }
    }
    void bot_var() {
        no_dub();
        Num_Var_dub = Num_Var;
        if (Num_Var == 0){
            Vatiant = "ROCK";
        } 
        else if(Num_Var == 1){
            Vatiant = "PAPER";
        }
        else{
            Vatiant = "SCISSORS";
        }
    }
}