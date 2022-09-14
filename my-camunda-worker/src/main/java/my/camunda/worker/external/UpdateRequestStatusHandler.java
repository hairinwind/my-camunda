package my.camunda.worker.external;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;
import org.camunda.bpm.client.task.ExternalTaskHandler;

@Component
@ExternalTaskSubscription("updateRequests")
public class UpdateRequestStatusHandler implements ExternalTaskHandler {
    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        System.out.println("...executing updateRequests externally...");
        System.out.println(externalTask);
        externalTaskService.complete(externalTask);
    }
}
