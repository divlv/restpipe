package lv.div.restpipe.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lv.div.restpipe.contracts.AgeHeightContract;
import lv.div.restpipe.pipe.RestPipe;
import lv.div.restpipe.responses.DefaultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"Controller 1"})
public class StringsRequestController {

    @Autowired
    RestPipe pipe;

    @ApiOperation(value = "Process request with string parameters")
    @GetMapping(value = "/strings")
    public ResponseEntity<DefaultResponse> getMethod() {

        // Dummy request data
        final AgeHeightContract t = new AgeHeightContract();
        t.setAge(33);
        t.setHeight(444);

        pipe.process(t);

        DefaultResponse response = new DefaultResponse();
        response.setResponseType(200);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
