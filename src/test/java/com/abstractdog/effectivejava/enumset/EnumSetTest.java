package com.abstractdog.effectivejava.enumset;

import java.util.EnumSet;

import org.junit.Assert;
import org.junit.Test;

public class EnumSetTest {

  public enum Color {
    RED, GREEN, BLUE
  }

  @Test
  public void testEnumSetIterate() {
    EnumSet<Color> set = EnumSet.of(Color.GREEN, Color.RED, Color.RED);
    Assert.assertEquals(2, set.size());
  }
}
