class Weapons{
    Weapon[] Weapons_List = new Weapon[3];
    Weapon Player_Weapon;
    Boolean Player_Weapon_Found = false;
    Weapons(){
    //Добавление Списков того, что бьет
    String[] RockBeat = {"PAPER"};
    String[] ScissorsBeat = {"ROCK"};
    String[] PaperBeat = {"SCISSORS"};
    //Создание каждого оружия
    Weapon Rock = new Weapon(RockBeat,"ROCK");
    Weapons_List[0] = Rock;
    Weapon Scissors = new Weapon(ScissorsBeat,"SCISSORS");
    Weapons_List[1] = Scissors;
    Weapon Paper = new Weapon(PaperBeat,"PAPER");
    Weapons_List[2] = Paper;
    }
    Boolean TryBeat(String Player,String Enemy){
        for(Weapon i:Weapons_List){
            if(i.Weapon_Name.equals(Player)){
                Player_Weapon = i;
                Player_Weapon_Found = true;
            }
        }
        if (Player_Weapon_Found == false){
            return false;
        }
        for(String i:Player_Weapon.CanBeat){
            if(i.equals(Enemy)){
                return false;
            }
        }
        return true;
    }
}