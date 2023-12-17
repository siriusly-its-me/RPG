package eu.telecomnancy.rpg.state;

public interface State {
    public void onEnterState();
    public void onUpdate();
    public void onTryToMove();
    public void onAttack();
}
