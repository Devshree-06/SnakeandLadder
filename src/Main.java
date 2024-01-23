//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Players player1=new Players("abc");
       SnakeLadderGame game=new SnakeLadderGame(player1);
        System.out.println("The first player is:"+player1.NamePlayer());
        while(player1.CurrentPosition()<100){
            game.Turns();
            game.selectOption();

        }
        if(player1.CurrentPosition()>100){
            int reduce=player1.CurrentPosition()-100;
            player1.StartCurrPos(100-reduce);
        }
        System.out.println("Position reached is 100");


    }
}