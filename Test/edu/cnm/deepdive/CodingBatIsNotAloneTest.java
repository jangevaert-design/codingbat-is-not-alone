package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatIsNotAlone.notAlone;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatIsNotAloneTest {

  private int[][] aloneArrayParams = {
      {1, 2, 3},
      {1, 2, 3, 2, 5, 2},
      {3, 4},
      {3, 3},
      {1, 3, 1, 2},
      {3},
      {},
      {7, 1, 6},
      {1, 1, 1},
      {1, 1, 1, 2}
  };

  private int[] aloneValParams = {2, 2, 3, 3, 1, 3, 3, 1, 1, 2};

  private int[][] aloneExpected = {
      {1, 3, 3},
      {1, 3, 3, 5, 5, 2},
      {3, 4},
      {3, 3},
      {1, 3, 3, 2},
      {3},
      {},
      {7, 7, 6},
      {1, 1, 1},
      {1, 1, 1, 2}

  };

  @Test
  void aloneTest() {
    for (int i = 0; i < aloneArrayParams.length; i++) {
      String actual = Arrays.toString(notAlone(aloneArrayParams[i], aloneValParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(aloneExpected[i]));
    }
  }

}