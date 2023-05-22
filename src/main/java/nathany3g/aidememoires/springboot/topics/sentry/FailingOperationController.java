package nathany3g.aidememoires.springboot.topics.sentry;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("sentry-integration")
public class FailingOperationController {
    @Operation(summary="Throw an exception to demonstrate the integration with Sentry")
    @PostMapping("/failing-operation")
    public void failingOperation() {
        throw new IllegalStateException("You should see this exception in Sentry");
    }
}
