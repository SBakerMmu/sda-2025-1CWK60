class DoesNotNeedToLandOnEndToWin implements IndexStrategy {
    @Override
    public int calculateIndex(int currentIndex, int positions, int endOfTailIndex) {
        currentIndex = currentIndex + positions;
        if (currentIndex > endOfTailIndex) {
            currentIndex = endOfTailIndex;
        }
        return currentIndex;
    }
}
