package state.overengineered_state_dp;

public class Stopwatch {

    private State currentState = new StoppedState(this);

    public void click() {
        System.out.println("click...");
        currentState.click();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
