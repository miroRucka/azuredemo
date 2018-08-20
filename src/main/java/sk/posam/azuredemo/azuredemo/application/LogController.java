package sk.posam.azuredemo.azuredemo.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rucka
 */
@RestController
public class LogController {

    public final static Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public void log(@RequestParam("message") String message) {
        LOGGER.debug("message >> {}", message);
        LOGGER.info("message >> {}", message);
        LOGGER.warn("message >> {}", message);
        LOGGER.error("message >> {}", message);
    }

}
