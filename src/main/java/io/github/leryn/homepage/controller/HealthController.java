package io.github.leryn.homepage.controller;

import io.github.leryn.homepage.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leryn
 * @since Leryn 1.0.0
 */
@RestController
public class HealthController {

  @GetMapping("/healthz")
  public Result<Void> healthz() {
    return Result.onSuccess("Health check passed!!");
  }

}
