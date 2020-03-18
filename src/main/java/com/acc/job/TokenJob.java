package com.acc.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 定时更新token
 *
 */
@Component("tokenJob")
public class TokenJob {

	/**
	 * 每一个小时执行一次
	 */
	@Scheduled(cron = "0 0 0/1 * * ?")
	public void execute () {

	}
}
