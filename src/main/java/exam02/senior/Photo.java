package exam02.senior;

public class Photo implements Qualified{

    private String name;
    private Quality quality;

    public Photo(String name) {
        this.name = name;
    }

    public Photo(String name, Quality quality) {
        this.name = name;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }


    @Override
    public Quality getQuality() {
        if (quality == null) {
            return Quality.NO_STAR;
        }
        return quality;
    }

    @Override
    public void setQuality(Quality q) {
        this.quality = q;

    }
}
