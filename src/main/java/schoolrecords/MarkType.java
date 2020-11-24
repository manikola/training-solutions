package schoolrecords;

public enum MarkType {
    A(5,"excellent"), B(4,"very good"), C(3, "improvement needed"), D(2,"close fail"), E(1, "fail");

    private final int value;
    private final String descrpition;

    MarkType(int value, String descrpition) {
        this.value = value;
        this.descrpition = descrpition;
    }

    public int getValue() {
        return value;
    }

    public String getDescrpition() {
        return descrpition;
    }
}