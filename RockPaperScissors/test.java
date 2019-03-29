class test{
    public static void main(String[] args) {
        Weapons Weap_packs = new Weapons();
        String Player = "ROCK";
        String Enemy = "PAPER";
        if(Weap_packs.TryBeat(Player, Enemy)){
            System.out.println("Ты выйграл");
        }
        else{
            System.out.println("Проиграл");
        }
    }
}