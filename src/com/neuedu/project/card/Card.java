package com.neuedu.project.card;

public class Card implements Comparable<Card> {
    /**
     * 花色下标
     */
    private int suit;
    /**
     * 点数下标
     */
    private int rank;

    /**
     * 存放花色的数组
     */
    public static final String[] SUIT = {"♦\uFE0F", "♣\uFE0F", "♥\uFE0F", "♠\uFE0F", "\uD83E\uDD21"};
    /**
     * 存放点数的数组
     */
    public static final String[] RANK = {"3", "4", "5", "6", "7", "8", "9", "10"
            , "J", "Q", "K", "A", "2", "小王", "大王"};

    // 方片 ♦
    public static final int DIAMOND = 0;
    // 梅花 ♣
    public static final int CLUB = 1;
    // 红桃 ♥
    public static final int HEART = 2;
    // 黑桃 ♠
    public static final int SPADE = 3;
    // 鬼牌 🤡
    public static final int JOKER = 4;

    // 点数
    public static final int THREE = 0;
    public static final int FOUR = 1;
    public static final int FIVE = 2;
    public static final int SIX = 3;
    public static final int SEVEN = 4;
    public static final int EIGHT = 5;
    public static final int NINE = 6;
    public static final int TEN = 7;
    public static final int JACK = 8;
    public static final int QUEEN = 9;
    public static final int KING = 10;
    public static final int ACE = 11;
    public static final int DEUCE = 12;
    public static final int BLACK = 13;
    public static final int COLOR = 14;


    public Card() {
    }

    public Card(int suit, int rank) throws RuntimeException {
        if (suit < Card.DIAMOND || suit > Card.JOKER) {
            throw new RuntimeException("没有这样的花色！");
        }
        if (rank < Card.THREE || rank > Card.COLOR) {
            throw new RuntimeException("没有这样的点数！");
        }
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * 输出格式
     *
     * @return 手牌（花色+点数）
     */
    @Override
    public String toString() {
        return SUIT[suit] + RANK[rank];
    }

    /**
     * 手牌排序的方法
     *
     * @param card the object to be compared.
     * @return 排序好的手牌
     */
    @Override
    public int compareTo(Card card) {
        // 点数不同
        if (this.rank != card.rank) {
            return this.rank - card.rank;
        }
        // 花色不同
        return this.suit - card.suit;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
