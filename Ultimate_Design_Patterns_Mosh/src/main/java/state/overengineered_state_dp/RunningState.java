package state.overengineered_state_dp;

public class RunningState implements State {

    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("STOPPED");
    }
}
