package es2;

import java.util.Arrays;
import java.util.StringJoiner;

public class SIM {
    String number;
    double credit;
    Call[] lastCalls;

    public SIM(String number) {
        this.number = number;
        this.credit = 0;
        this.lastCalls = new Call[5];
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SIM.class.getSimpleName() + "[", "]")
                .add("number='" + number + "'")
                .add("credit=" + credit)
                .add("lastCalls=" + Arrays.toString(lastCalls))
                .toString();
    }
}
