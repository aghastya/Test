package Frame;



import org.apache.log4j.Logger;

public class Logging {
	private static Logger log = Logger.getLogger(Logging.class.getName());
	
	
	
	public void data(){
		log.info("test");
	}
}
