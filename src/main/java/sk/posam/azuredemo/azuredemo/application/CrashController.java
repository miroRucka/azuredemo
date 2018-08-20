package sk.posam.azuredemo.azuredemo.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rucka
 */
@RestController
public class CrashController {

    public static final Logger LOGGER = LoggerFactory.getLogger(CrashController.class);


    @GetMapping("/stack-overflow")
    public void crash() throws Exception {
        generateOOM();
    }

    @GetMapping("/shut-down")
    public void shutDown() {
        System.exit(-1);
    }

    private void generateOOM() throws Exception {
        int iteratorValue = 20;
        LOGGER.warn("=================> OOM test started..");
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            LOGGER.warn("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iteratorValue = iteratorValue * 5;
            LOGGER.warn("Required Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }
}
