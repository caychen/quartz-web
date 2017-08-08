package org.com.cay.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

//可以实现Job接口，也可以继承QuartzJobBean
public class FirstSchedulerJob extends QuartzJobBean {

	private OtherBean otherBean;

	public OtherBean getOtherBean() {
		return otherBean;
	}

	public void setOtherBean(OtherBean otherBean) {
		this.otherBean = otherBean;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("FirstSchedulerJob execute..." + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
