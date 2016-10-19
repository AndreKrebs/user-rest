package eti.krebscode.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class UserTask {

	private static Logger LOG = LoggerFactory.getLogger(UserTask.class);

	@Scheduled(initialDelay=1000, fixedDelay=6000)
	public void countUsers() {
		LOG.info("************************* Thread rodou!");
	}
	
}
