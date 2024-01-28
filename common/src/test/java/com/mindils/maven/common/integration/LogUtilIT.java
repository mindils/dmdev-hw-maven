package com.mindils.maven.common.integration;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mindils.maven.common.LogUtil;
import org.junit.jupiter.api.Test;

public class LogUtilIT {

  @Test
  public void test() {
    LogUtil.log("hello world");
    assertTrue(true);
  }
}
