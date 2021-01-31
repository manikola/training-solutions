package week06d05.senior;

public class Bottle {

    private BottleType type;
    private int filledUntil;

    public Bottle(BottleType type, int filledUntil) {
        if (filledUntil < 1) {
            throw new IllegalArgumentException("Amount is too small");
        }
        this.type = type;
        this.filledUntil = filledUntil;
    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUntil() {
        return filledUntil;
    }

    public static Bottle of(BottleType type){
        return new Bottle(type,0);
    }

    public int fill(int fillAmount) {
        this.filledUntil += fillAmount;
        if (filledUntil > this.type.getMaximumAmount()) {
            throw new IllegalArgumentException("Overflowed!");
        }return filledUntil;
    }

    }



//Készíts egy Bottle nevű osztályt, amelynek van 2 attribútuma: BottleType type és int filledUntil.
// A BottleType legyen felsorolásos típus az alábbi értékekkel: GLASS_BOTTLE és PET_BOTTLE!
// A Bottle nevű osztálynak legyen egy static metódusa of néven, mely paraméterként egy BottleType-ot vár
// és visszaad egy új Bottle objektumot amelyet a megadott paraméter alapján hoz létre. A Bottle osztálynak
// legyen egy fill metódusa, mely egy int fillAmount paramétert vár. A fill meghívása esetén végezzen ellenőrzést,
// hogy megtelt-e már a Bottle objektum. Az ehhez szükséges int maximumAmount mezőt a BottleType tartalmazza!
// Ha túlcsordulna a Bottle objektum, akkor dobj kivételt!