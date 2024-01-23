public class SnakeLadderGame {
    Players player;
    Dice die;
    SnakeLadderGame(Players player){
        this.player=player;
        this.die=new Dice();
    }
    public void Turns(){

        int dieval=Dice.roll();
        System.out.println("The dice number is: "+dieval);
        int newPos= player.CurrentPosition()+dieval;
        player.StartCurrPos(newPos);
        System.out.println("The position of player is: "+player.CurrentPosition());

    }

}
