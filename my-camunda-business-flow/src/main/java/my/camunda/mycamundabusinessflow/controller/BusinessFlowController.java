package my.camunda.mycamundabusinessflow.controller;

import lombok.RequiredArgsConstructor;
import my.camunda.mycamundabusinessflow.service.CamundaProcessService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessFlowController {

    @Autowired
    private CamundaProcessService camundaProcessService;

    @GetMapping("/updateStatus")
    public ProcessInstance updateStatus() {
        return camundaProcessService.executeProcess();
    }
}
