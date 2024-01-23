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
    public void selectOption(){
        int option=(int)(Math.random()*3);
        switch(option){
            case 0:
                System.out.println("Player cannot move ahead: No Play");
                break;
            case 1:
                int ladder=Dice.roll();
                player.StartCurrPos(player.CurrentPosition()+ladder);
                System.out.println("Player moves ahead by :"+ladder+"steps");
                break;
            case 2:
                int snake=Dice.roll();
                player.StartCurrPos(player.CurrentPosition()-snake);
                System.out.println("Player loses " +snake+ " steps");
        }
    }

}
