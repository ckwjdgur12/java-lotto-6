package lotto;

public enum Rank {

    FIRST(6, false, 2_000_000_000, "6개 일치 (2,000,000,000원) - "),
    SECOND(5, true, 30_000_000, "5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    THIRD(5, false, 1_500_000, "5개 일치 (1,500,000원) - "),
    FOURTH(4, false, 50_000, "4개 일치 (50,000원) - "),
    FIFTH(3, false, 5_000, "3개 일치 (5,000원) - ");

    Rank(int matchedCnt, boolean hasBonusNumber, int prize, String message) {
        this.matchedCnt = matchedCnt;
        this.hasBonusNumber = hasBonusNumber;
        this.prize = prize;
        this.message = message;
    }

    public int matchedCnt;
    public boolean hasBonusNumber;
    public int prize;
    public String message;

}


