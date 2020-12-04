package week06d05;

public class Biscuit {

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getBiscuitType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {
        Biscuit favorite = new Biscuit(biscuitType, gramAmount);
        return favorite;


    }

    @Override
    public String toString() {
        return "type: " + type + " + gramAmount:" + gramAmount;
    }
}




