class BasicGameScenario3Shaker implements DiceShaker {

    private final static int[] SHAKES = new int[]{12, 12, 7, 11};
    private int index = 0;

    @Override
    public int shake() {

        return SHAKES[index++];
    }
}
