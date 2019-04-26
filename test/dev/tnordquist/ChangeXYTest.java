package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ChangeXYTest {

  private static Object[][] changeXY() {
    return new Object[][]{
        {"codex","codey"}
    };
  }

  @ParameterizedTest
  @MethodSource
  void changeXY(String input, String expected) {

    String actual = ChangeXY.changeXY(input);
    assertEquals(expected,actual);

  }
}