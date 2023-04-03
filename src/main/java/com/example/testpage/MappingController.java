package com.example.testpage;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class MappingController {
    @RequestMapping("/hello-basic")
    public String helloBasic() {
        log.info("hello basic");
        return "Basic Ok";
    }
    @RequestMapping(value = "/mapping-get-v1", method = RequestMethod.GET)
    public String mappingGetV1() {
        log.info("mappingGetV1");
        return "V1 OK";
    }
    /*위를 축약하면 아래형태(편리한 축약 애노테이션 코드)
    @GetMappinng
    @PostMapping
    @PutMapping
    @DeleteMapping
    @PatchMapping
     */
    @GetMapping(value = "/mapping-get-v2")
    public String mappingGetV2() {
        return "V2 OK";
    }
    @GetMapping("/mapping/{userID}")
        public String mappingPath(@PathVariable("userID") String data) {
        log.info("mappingPath userId={}", data);
        return "Path OK";
    }
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "Variable Path  OK";
    }
    @GetMapping(value = "/mapping-param", params = "mode=debug")
        public String mappingParam() {
        log.info("mappingParam");
        return "mappingParam OK";
    }
    @GetMapping(value = "/mapping-header", headers = "mode=debug")
    public String mappingHeader() {
        log.info("mappingHeader");
        return "Header Ok";
    }
    @PostMapping(value = "/mapping-consume", consumes = "application/json")
    public String mappingConsumes() {
        log.info("mappingConsumes");
        return "Consumes Ok";
    }
    @PostMapping(value = "/mapping-produce", produces = "text/html")
        public String mappingProduces() {
        log.info("mappingProduces");
        return "Produces OK";
    }
}
