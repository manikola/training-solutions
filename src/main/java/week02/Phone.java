package week02;

public class Phone {

    String type;
    int mem;

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Nokia", 10);


    }



}
