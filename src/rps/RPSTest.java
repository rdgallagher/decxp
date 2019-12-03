package rps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static rps.Result.*;
import static rps.Throw.PAPER;
import static rps.Throw.ROCK;
import static rps.Throw.SCISSORS;

public class RPSTest {

    @Test
    public void rockVsScissors() {
        assertEquals(P1_WINS, RPS.play(ROCK, SCISSORS));
    }

    @Test
    public void scissorsVsRock() {
        assertEquals(P2_WINS, RPS.play(SCISSORS, ROCK));
    }

    @Test
    public void rockVsPaper() {
        assertEquals(P2_WINS, RPS.play(ROCK, PAPER));
    }

    @Test
    public void paperVsRock() {
        assertEquals(P1_WINS, RPS.play(PAPER, ROCK));
    }

    @Test
    public void scissorsVsPaper() {
        assertEquals(P1_WINS, RPS.play(SCISSORS, PAPER));
    }

    @Test
    public void paperVsScissors() {
        assertEquals(P2_WINS, RPS.play(PAPER, SCISSORS));
    }

    @Test
    public void scissorsVsScissors() {
        assertEquals(TIE, RPS.play(SCISSORS, SCISSORS));
    }

    @Test
    public void rockVsRock() {
        assertEquals(TIE, RPS.play(ROCK, ROCK));
    }

    @Test
    public void paperVsPaper() {
        assertEquals(TIE, RPS.play(PAPER, PAPER));
    }

    @Test
    public void p1Invalid() {
        assertEquals(INVALID, RPS.play(null, PAPER));
    }

    @Test
    public void p2Invalid() {
        assertEquals(INVALID, RPS.play(ROCK, null));
    }

    @Test
    public void bothInvalid() {
        assertEquals(INVALID, RPS.play(null, null));
    }
}
