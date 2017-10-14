
public class LoggerSocket implements Logger {

	SocketStream socketStream = new SocketStream();
	
	@Override
	public void escribir() {
		// TODO Auto-generated method stub
		socketStream.escribir();

	}

}
