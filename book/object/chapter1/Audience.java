package book.object.chapter1;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return this.bag;
//    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
