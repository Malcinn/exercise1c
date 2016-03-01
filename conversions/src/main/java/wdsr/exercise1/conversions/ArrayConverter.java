package wdsr.exercise1.conversions;

import java.util.Arrays;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	private static final Logger log = LogManager.getLogger();
    public int[] convertToInts(String[] strings) {
    	log.debug("convertToInts entered args :  "+Arrays.toString(strings));
    	int[] returnArray = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    	log.debug("convertToInts exiting result:  "+Arrays.toString(returnArray));
        return returnArray;
    }
}
