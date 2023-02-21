package book.object.chapter2;

/**
 * 금액 할인 정책
 * 조건을 만족할 경우 일정 금액을 할인
 */
public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    // 할인 요금
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
