package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	// Adapter Design Pattern implementation
	private JLoggerManager jloggerManager;
	public JLoggerManagerAdapter(JLoggerManager jLoggerManager) {
		this.jloggerManager = jLoggerManager;
	}
	
	@Override
	public void log(String message) {
		this.jloggerManager.log(message);
	}

}
