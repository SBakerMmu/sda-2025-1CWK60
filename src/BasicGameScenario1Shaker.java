class BasicGameScenario1Shaker implements DiceShaker {

    private final static int[] SHAKES = new int[]{12, 12, 7, 8};
    private int index = 0;

    @Override
    public int shake() {
        return SHAKES[index++];
    }
}
