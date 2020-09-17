package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author itutry
 * @create 2020-05-15_16:43
 */
public class Practice1Test {

  @Test
  public void getDays_should_return_right_when_date_before_labor_day() {
    final LocalDate date = LocalDate.of(2020, 4, 30);
    Assert.assertEquals(1, Practice1.getDaysBetweenNextLaborDay(date));
  }

  @Test
  public void getDays_should_return_right_when_date_after_labor_day() {
    final LocalDate date = LocalDate.of(2020, 6, 1);
    Assert.assertEquals(334, Practice1.getDaysBetweenNextLaborDay(date));
  }

  @Test
  public void getDays_should_return_right_when_date_equals_labor_day_and_next_year_is_not_leap() {
    final LocalDate date = LocalDate.of(2020, 5, 1);
    Assert.assertEquals(365, Practice1.getDaysBetweenNextLaborDay(date));
  }

  @Test
  public void getDays_should_return_right_when_date_equals_labor_day_and_next_year_is_leap() {
    final LocalDate date = LocalDate.of(2019, 5, 1);
    Assert.assertEquals(366, Practice1.getDaysBetweenNextLaborDay(date));
  }
}
