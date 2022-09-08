public enum RoomType {
    SINGLE(1, 5),
    DOUBLE(2, 10),
    TRIPLE(3, 15),
    FAMILY(4, 20);

    private final int value;
    private final int rate;

    RoomType(int value, int rate) {
        this.value = value;
        this.rate = rate;
    }

    public int getValue() {
        return this.value;
    }

    public int getRate() {
        return this.rate;
    }
}

