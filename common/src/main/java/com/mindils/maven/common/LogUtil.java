package com.mindils.maven.common;

public class LogUtil {

  private LogUtil() {
  }

  public static void log(String text) {
    System.out.println(text);
  }

  public static boolean isLogging() {
    return true;
  }
}