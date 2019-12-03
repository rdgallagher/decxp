package rps;

import static rps.Result.*;
import static rps.Throw.PAPER;
import static rps.Throw.ROCK;
import static rps.Throw.SCISSORS;

public class RPS {
    public static Result play(Throw p1, Throw p2) {
        if (p1 == null || p2 == null) {
            return INVALID;
        }

        if (p1 == p2) {
            return TIE;
        }

        if (p1 == SCISSORS && p2 == ROCK
                || p1 == ROCK && p2 == PAPER
                || p1 == PAPER && p2 == SCISSORS) {
            return P2_WINS;
        }

        return P1_WINS;
    }
}
