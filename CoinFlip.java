public class CoinFlip {
    public CoinFlip () {}

    public String Flip() {
        if ((int) (Math.random() * 2) + 1 == 1) {
            return "Heads";
        } else return "Tails";
    }

    public double simulate(int flips) {
        double heads = 0;
        double flipper = 0;
        for (int i = 0; i < flips; i ++) {
            flipper ++;
            if (Flip().equals("Heads")) {
                heads ++;
            }
        }
        return heads / flipper;
    }
}
