package singleton;
import com.sun.istack.internal.logging.Logger;

import LoggerInterface;

public class LoggerImpl implements LoggerInterface{
	 private volatile  static LoggerImpl obj ;
	 
	 //static Logger logger;
	 
	 public static LoggerImpl getInstance() {
		 if(obj==null)
		 {
			 synchronized(LoggerImpl.class)
			 {
				 if(obj==null) {
					 obj = new LoggerImpl();
				 }
			 }
		 }
		return obj;
		 
	 }

	@Override
	public void Log(String log) {
		System.out.println(log);
		
	}
	 
}
