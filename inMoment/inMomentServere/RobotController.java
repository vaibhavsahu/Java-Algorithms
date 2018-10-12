package com.inmoment.controller;

import com.inmoment.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RobotController {

    private RestTemplate restTemplate;
    private HttpEntity<String> entity;

    @PostConstruct
    public void init() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "XZA0ZDaayc544Z5nVvS499MG5Vw38i0u4mni9vH8");
        entity = new HttpEntity<>("parameters", headers);
        restTemplate = new RestTemplate();
        System.out.println("init()");
    }

    @RequestMapping("/find/{word}")
    public Map<String, String> findDescription(@PathVariable String word) {
        Map<String, String> output = new HashMap<>();
        Status status = getStatus();
        int u = status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word);
        boolean forward = false;
        boolean backward = false;

        if (u == 0) {
            output.put("word", status.getCurrentTermDefinition());
            return output;
        }

        while (u != 0) {
            System.out.println(status.getCurrentTerm());
            if (u < 0) {
                forward = true;
                if (backward) {
                    status = moveToNextTerm();
                    while (status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word) != 0 && status.getHasNextTerm()) {
                        if (status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word) > 0 && status.getHasNextTerm()) {
                            output.put("word", "word not found");
                            return output;
                        }
                        status = moveToNextTerm();
                        System.out.println(status.getCurrentTerm());
                    }
                    if (!status.getCurrentTerm().equalsIgnoreCase(word)) {
                        output.put("word", "word not found");
                        return output;
                    }
                } else {
                    status = moveToNextTerm();
                    while (status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word) != 0 && status.getHasNextTerm()) {
                        if (status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word) > 0 && status.getHasNextTerm()) {
                            output.put("word", "word not found");
                            return output;
                        }
                        status = moveToNextTerm();
                        System.out.println(status.getCurrentTerm());
                    }
                    if (!status.getCurrentTerm().equalsIgnoreCase(word)) {
                        status = moveToNextPage();
                        System.out.println(status.getCurrentTerm());
                        u = status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word);
                    }
                }
            } else if (u > 0) {
                backward = true;
                if (!forward) {
                    if (status.getHasPreviousTerm()) {
                        status = moveToPreviousTerm();
                        System.out.println(status.getCurrentTerm());
                        while (status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word) != 0 && status.getHasPreviousTerm()) {
                            if (status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word) < 0 && status.getHasPreviousTerm()) {
                                output.put("word", "word not found");
                                return output;
                            }
                            status = moveToPreviousTerm();
                            System.out.println(status.getCurrentTerm());
                        }

                         if (!status.getCurrentTerm().equalsIgnoreCase(word)) {
                            status = moveToNextPage();
                             System.out.println(status.getCurrentTerm());
                        }
                        u = status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word);
                    } else {
                        status = moveToPreviousPage();
                        System.out.println(status.getCurrentTerm());
                        u = status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word);
                    }


                } else {
                    if (status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word) != 0 && status.getHasPreviousTerm()) {
                        status = moveToPreviousTerm();
                        System.out.println(status.getCurrentTerm());
                        u = status.getCurrentTerm().toLowerCase().compareToIgnoreCase(word);
                    }
                }
            }
        }
        if (u == 0) {
            output.put("word", status.getCurrentTermDefinition());
            return output;
        }
        output.put("word", "word not found");
        return output;
    }

    Status getStatus() {
        ResponseEntity<Status> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/status", HttpMethod.GET, entity, Status.class);
        return exchange.getBody();
    }

    Status moveToNextPage() {
        ResponseEntity<Status> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/move-to-next-page", HttpMethod.POST, entity, Status.class);
        return exchange.getBody();
    }

    Status moveToPreviousPage() {
        ResponseEntity<Status> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/move-to-previous-page", HttpMethod.POST, entity, Status.class);
        return exchange.getBody();
    }

    public String jumpToFirstPage() {
        ResponseEntity<String> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/jump-to-first-page", HttpMethod.POST, entity, String.class);
        System.out.println(exchange.getBody());
        return exchange.getBody();
    }

    public String jumpToLastPage() {
        ResponseEntity<String> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/jump-to-last-page", HttpMethod.POST, entity, String.class);
        System.out.println(exchange.getBody());
        return exchange.getBody();
    }

    Status moveToNextTerm() {
        ResponseEntity<Status> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/move-to-next-term", HttpMethod.POST, entity, Status.class);
        return exchange.getBody();
    }

    Status moveToPreviousTerm() {
        ResponseEntity<Status> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/move-to-previous-term", HttpMethod.POST, entity, Status.class);
        return exchange.getBody();
    }

    public String jumpToFirstTerm() {
        ResponseEntity<String> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/jump-to-first-term", HttpMethod.POST, entity, String.class);
        System.out.println(exchange.getBody());
        return exchange.getBody();
    }

    public String jumpToLastTerm() {
        ResponseEntity<String> exchange = restTemplate.exchange("https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod/jump-to-last-term", HttpMethod.POST, entity, String.class);
        System.out.println(exchange.getBody());
        return exchange.getBody();
    }

}
