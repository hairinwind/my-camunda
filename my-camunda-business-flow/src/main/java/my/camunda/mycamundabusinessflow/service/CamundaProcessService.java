package my.camunda.mycamundabusinessflow.service;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class CamundaProcessService  {

    private final RuntimeService runtimeService;

    public ProcessInstance executeProcess() {
        String processKey = "updateStatus";
        String businessKey = String.valueOf(new Random().nextInt());
        Map<String, Object> variables = new HashMap<>();
        System.out.println("started process: " + processKey + " businessKey: " + businessKey);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processKey, businessKey, variables);
        System.out.println(processInstance);
        return processInstance;
    }
}
