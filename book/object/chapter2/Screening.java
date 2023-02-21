package book.object.chapter2;

import java.time.LocalDateTime;

public class Screening {
    // 상영할 영화
    private Movie movie;
    // 상영 순번
    private int sequence;
    // 상영 시작 시간
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    // 영화를 예매하고, 예매 정보를 리턴한다.
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    // 전체 예매 요금을 계산해 리턴한다.

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this)
                .times(audienceCount);
    }
}
