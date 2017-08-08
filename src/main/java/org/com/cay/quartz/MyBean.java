package org.com.cay.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

	public void printMessage(){
		System.out.println("Mybean 执行时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
