package state.overengineered_state_dp;

public class StoppedState implements State {

    private Stopwatch stopwatch;

    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("RUNNING");
    }
}
