public class Players {
    private String name;
    int currentpos;

    Players(String n){
        this.name=n;
        this.currentpos=0;
    }
    public String NamePlayer(){
        return name;
    }
    public int CurrentPosition(){
        return currentpos;
    }
    public void StartCurrPos(int currentpos){
        this.currentpos=currentpos;
    }

}
