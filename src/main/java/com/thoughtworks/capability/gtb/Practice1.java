package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int thisYear = date.getYear();
    LocalDate laborDayOfThisYear = LocalDate.of(thisYear, 5, 1);
    LocalDate laborDayOfNextYear = laborDayOfThisYear.plusYears(1);
    long daysBetweenTwoLaborDay = laborDayOfNextYear.lengthOfYear();
    if (date.isAfter(laborDayOfThisYear)) {
      return daysBetweenTwoLaborDay - (date.getDayOfYear() - laborDayOfNextYear.getDayOfYear()) + 1;
    } else if (date.isBefore(laborDayOfThisYear)) {
      return laborDayOfThisYear.getDayOfYear() - date.getDayOfYear();
    } else {
      return daysBetweenTwoLaborDay;
    }
  }
}
