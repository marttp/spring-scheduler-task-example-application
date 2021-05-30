package dev.tpcoder.springschedulertaskexample.config;

import java.time.ZonedDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronScheduler {

  private final Logger logger = LoggerFactory.getLogger(CronScheduler.class);

  @Scheduled(cron = "${cron.expression}")
  public void cronScheduleTask() {
    logger.info("schedule tasks using cronScheduleTask - {}", ZonedDateTime.now());
  }
}
