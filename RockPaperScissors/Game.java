class Game{
    public static void main(String[] args) {
        Weapons Weap_packs = new Weapons();
        String Variant = "";
        Bot enemy = new Bot();
        Player P1 = new Player();
        int wins = 0;
        while (wins != 3){
            P1.player_var();
            Variant = P1.Var;
            enemy.bot_var();
            String Bot_Variant = enemy.Vatiant;
            System.out.println(Variant+ " :Player");
            System.out.println(enemy.Vatiant+" :Enemy");

            if (Variant.equals(enemy.Vatiant)){
                System.out.println("DRAW");
            }
            else if(Variant.equals("QUIT")){
                System.out.println("Exit the game...");
                break;
            }
            else if(Weap_packs.TryBeat(Variant, Bot_Variant)){
                System.out.println("WIN");
            }
            else{
                System.out.println("LOSE");
            }

            if (wins == 3){
                System.out.println("");
                System.out.println("Congratulate");
            }
        }
    }
}