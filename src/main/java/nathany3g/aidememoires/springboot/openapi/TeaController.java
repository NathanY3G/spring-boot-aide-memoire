package nathany3g.aidememoires.springboot.openapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class TeaController {
    @Operation(summary="Returns a fresh cup of really hot tea", responses = {
        @ApiResponse(responseCode = "201", description = "Share and enjoy"),
        @ApiResponse(responseCode = "404", description = "Tea was not found"),
        @ApiResponse(responseCode = "418", description = "I'm a teapot")
    })
    @GetMapping("/tea")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public void getTea() {
    }
}
