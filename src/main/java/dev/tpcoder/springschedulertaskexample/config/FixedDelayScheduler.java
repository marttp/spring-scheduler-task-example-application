package dev.tpcoder.springschedulertaskexample.config;

import java.time.ZonedDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedDelayScheduler {

  private final Logger logger = LoggerFactory.getLogger(FixedDelayScheduler.class);

  @Scheduled(fixedDelay = 10000)
  public void fixedDelayScheduleTask() {
    logger.info("schedule tasks using fixedDelayScheduleTask - {}", ZonedDateTime.now());
  }

  @Scheduled(initialDelay = 5000, fixedDelay = 10000)
  public void fixedDelayWithInitialScheduleTask() {
    logger.info("schedule tasks using fixedDelayWithInitialScheduleTask - {}", ZonedDateTime.now());
  }

  @Scheduled(initialDelayString = "${fixed-delay.initial}", fixedDelayString = "${fixed-delay.delay}")
  public void fixedDelayInStringScheduleTask() {
    logger.info("schedule tasks using fixedDelayInStringScheduleTask - {}", ZonedDateTime.now());
  }
}
