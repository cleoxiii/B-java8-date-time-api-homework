package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate laborDayOfThisYear = LocalDate.of(date.getYear(), 5, 1);
    LocalDate laborDayOfNextYear = laborDayOfThisYear.plusYears(1);
    return date.isBefore(laborDayOfThisYear) ?
            date.until(laborDayOfThisYear, ChronoUnit.DAYS) : date.until(laborDayOfNextYear, ChronoUnit.DAYS);
  }
}
