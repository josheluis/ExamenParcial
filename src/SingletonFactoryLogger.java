
public class SingletonFactoryLogger {

	private static SingletonFactoryLogger instance = null;
	private SingletonFactoryLogger(){		
	}
	
	public static SingletonFactoryLogger getInstance(){
		if (instance == null) {
			synchronized (SingletonFactoryLogger.class) {
				instance = new	SingletonFactoryLogger();
			}
		}
		return instance;
	}
	
	
	Logger getLogger(String tipo){
		if (tipo.equals("FILE")){
		  return new LoggerDataBase();
		} else if (tipo.equals("BD")) {
		  return new LoggerDataBase();
		} else if (tipo.equals("SOCKET")) {
		  return new LoggerSocket();	
		} else return null;
	}
	
	
}
