package dev.tpcoder.springschedulertaskexample.config;

import java.time.ZonedDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class FixedRateScheduler {

  private final Logger logger = LoggerFactory.getLogger(FixedRateScheduler.class);

  @Scheduled(fixedRate = 10000)
  public void fixedRateScheduleTask() {
    logger.info("schedule tasks using fixedRateScheduleTask - {}", ZonedDateTime.now());
  }

  @Scheduled(fixedRateString = "${fixed-rate.value}")
  public void fixedRateInStringScheduleTask() {
    logger.info("schedule tasks using fixedRateInStringScheduleTask - {}", ZonedDateTime.now());
  }

  @Async
  @Scheduled(fixedRate = 2000)
  public void fixedRateAsyncScheduleTask() throws InterruptedException {
    logger.info("Thread name: {}", Thread.currentThread().getName());
    logger.info("schedule tasks using fixedRateAsyncScheduleTask - {}", ZonedDateTime.now());
    Thread.sleep(3000);
  }
}
