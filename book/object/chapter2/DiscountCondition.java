package book.object.chapter2;

// 할인 조건
public interface DiscountCondition {
    /**
     * 전달된 상영 정보가 할인 조건을 만족시키면 true 를 리턴한다.
     */
    boolean isSatisfiedBy(Screening screening);
}
