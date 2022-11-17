public class printNums {
    private int value;
    private int numRounds;

    public printNums() {}

    public void printNums(int value, int numRounds) {
        for (int i = 0; i < numRounds; i++) {
            int j = -1;
            while (j != value) {
                j = (int) (Math.random()*10);
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
