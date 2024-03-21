class Production {
    String title;
    String director;
    String writer;

    public Production(String title, String director, String writer) {
        this.title = title;
        this.director = director;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Production{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}

class Play extends Production {
    static int performances;
    int seatsBooked;

    public Play(String title, String director, String writer, int seatsBooked) {
        super(title, director, writer);
        this.seatsBooked = seatsBooked;
        performances++;
    }

    public int getPerformances() {
        return performances;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    @Override
    public String toString() {
        return "Play{" +
                "performances=" + performances +
                ", seatsBooked=" + seatsBooked +
                '}';
    }
}

class Musical extends Play {
    String composer;
    String lyricist;

    public Musical(String title, String director, String writer, String composer, String lyricist, int seatsBooked) {
        super(title, director, writer, seatsBooked);
        this.composer = composer;
        this.lyricist = lyricist;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getLyricist() {
        return lyricist;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    @Override
    public String toString() {
        return "Musical{" +
                "composer='" + composer + '\'' +
                ", lyricist='" + lyricist + '\'' +
                '}';
    }
}

public class Tester {
    static final int PLAY_SEAT_COST = 500;
    static final int MUSICAL_SEAT_COST = 800;

    public static void main(String[] args) {
        // 3 different objects of Play with some seats booked
        Play p1 = new Play("The Lion King", "Disney", "Disney", 100);
        Play p2 = new Play("Chotta Bheem", "Disney", "Disney", 150);
        Play p3 = new Play("Tom and Jerry", "Disney", "Disney", 200);

        // 2 objects of Musical with some seats booked
        Musical m1 = new Musical("Mast Malang Jhoom", "T Series", "T Series", "T Series", "T Series", 120);
        Musical m2 = new Musical("Ghungroo", "T Series", "T Series", "T Series", "T Series", 180);

        // Calculate total box office collection for Play and Musical
        int totalPlayCollection = p1.getSeatsBooked() * PLAY_SEAT_COST + p2.getSeatsBooked() * PLAY_SEAT_COST + p3.getSeatsBooked() * PLAY_SEAT_COST;
        int totalMusicalCollection = m1.getSeatsBooked() * MUSICAL_SEAT_COST + m2.getSeatsBooked() * MUSICAL_SEAT_COST;
        int totalBoxOfficeCollection = totalPlayCollection + totalMusicalCollection;

        // printing the number of performances and total box office collection
        System.out.println("The number of performances: " + Play.performances);
        System.out.println("Total Box Office Collection: Rs." + totalBoxOfficeCollection);
    }
}
