package my.camunda.mycamundabusinessflow;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.spring.ProcessEngineFactoryBean;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@SpringBootApplication
public class MyCamundaBusinessFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCamundaBusinessFlowApplication.class, args);
	}

	@Autowired
	ApplicationContext context;

	@PostConstruct
	public void post() {
		System.out.println(context.getBean("camundaProcessService"));
	}
}
