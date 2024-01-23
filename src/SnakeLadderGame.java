public class SnakeLadderGame {
    Players player;
    Dice die;
    SnakeLadderGame(Players player){
        this.player=player;
        this.die=new Dice();
    }
    public void Turns(){

        int dieval=Dice.roll();
        int newPos= player.CurrentPosition()+dieval;
    }
}
