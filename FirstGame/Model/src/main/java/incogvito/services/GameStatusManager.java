package incogvito.services;

public interface GameStatusManager {
    public GameStatus getGameStatus();

    public Map<String, GameStatus> listGameStatuses();

    public void loadGameStatus(String id);

    public void saveGameStatus();

    public void resetGameStatus();

    public HeroStatus getCurrentHeroStatus();

    public void resetHeroStatus();
}