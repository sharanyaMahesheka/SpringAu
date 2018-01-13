package singleton;
import LoggerImpl;

public class Client {

	public static void main(String args[]) {
		LoggerImpl logger = LoggerImpl.getInstance();
		logger.Log("Hello world");
	}
}
