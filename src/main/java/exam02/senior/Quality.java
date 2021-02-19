package exam02.senior;

public enum Quality {

    NO_STAR(0),ONE_STAR(1),TWO_STAR(2);

    private int stars;

    Quality(int stars) {
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }
}
