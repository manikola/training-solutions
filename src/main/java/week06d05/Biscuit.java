package week06d05;

public class Biscuit {

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType type() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount) {
        Biscuit favorite = new Biscuit(type, gramAmount);
        return favorite;


    }

    @Override
    public String toString() {
        return "type: " + type + " + gramAmount:" + gramAmount;
    }
}




