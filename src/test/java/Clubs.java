public class Clubs {
    private String club;
    private int point;

    public Clubs (String club, int point){
        this.club = club;
        this.point = point;
    }

    public Clubs() {
    }

    @Override
    public String toString() {
        return "club='" + club + '\'' +
                ", point=" + point;
    }
}
