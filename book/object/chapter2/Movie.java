package book.object.chapter2;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    //  기본 요금
    private Money fee;
    // 할인 정책 - 추상화
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    // 할인된 금액을 계산해 리턴한다.
    public Money calculateMovieFee(Screening screening) {
        if (discountPolicy == null) {
            return fee;
        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    // 실행 시점에 할인 정책을 변경한다.
    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
}
