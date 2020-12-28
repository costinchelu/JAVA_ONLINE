package WithStatePattern;

import WithStatePattern.Context.Fan;

public class Main {

    public static void main(String[] args) {

        Fan fan = new Fan();
        System.out.println(fan);

        for(int i = 0; i < 4; i++) {
            fan.pullChain();
            System.out.println(fan);
        }

    }
}
