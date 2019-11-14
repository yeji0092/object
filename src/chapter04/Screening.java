package chapter04;

import java.time.LocalTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalTime whenScreened;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public LocalTime getWhenScreened() {
        return whenScreened;
    }

    public void setWhenScreened(LocalTime whenScreened) {
        this.whenScreened = whenScreened;
    }
}
