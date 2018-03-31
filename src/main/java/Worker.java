public class Worker {
    private int number;
    private String name;
    private int level; // 1 表示小兵 2表示组长 3表示经理 4表示大区经理
    private String cardNo; // 银行卡号


    public Worker(int number, String name, int level, String cardNo) {
        this.number = number;
        this.name = name;
        this.level = level;
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
