public class BreakLabel {
    public static void main(String[] args) {
        int out, in = 0;
        outer: for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++) {
                if (in > 10)
                    break outer;
            }
            System.out.println("Ben trong vong lap out: out = " + out + " in = " + in);
        }
        System.out.println("Ben ngoai vong lap out: out = " + out + " in = " + in);
    }
}
