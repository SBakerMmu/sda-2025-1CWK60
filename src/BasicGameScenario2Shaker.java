class BasicGameScenario2Shaker implements DiceShaker {

    private final static int[] SHAKES = new int[]{8, 2, 3, 4, 9};
    private int index = 0;

    @Override
    public int shake() {
        return SHAKES[index++];
    }
}
