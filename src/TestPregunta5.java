
public class TestPregunta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonFactoryLogger factory = SingletonFactoryLogger.getInstance();
		Logger lsocket = factory.getLogger("SOCKET");
		
		lsocket.escribir();
	}

}
