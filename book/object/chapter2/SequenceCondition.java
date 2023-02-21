package book.object.chapter2;

// 순번 기준 할인 조건
public class SequenceCondition implements DiscountCondition {
    // 순번
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
