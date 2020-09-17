package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {
  private static final int FRIDAY = 5;
  private static final int SATURDAY = 6;

  public static LocalDate getNextWorkDate(LocalDate date) {
    if (date.getDayOfWeek().getValue() == FRIDAY) {
      return date.plusDays(3);
    } else if (date.getDayOfWeek().getValue() == SATURDAY) {
      return date.plusDays(2);
    } else {
      return date.plusDays(1);
    }
  }
}
