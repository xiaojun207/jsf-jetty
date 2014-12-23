/**
 * 
 */

import java.io.File;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author xiaojun
 * 
 */
public class Application {
	public static int WebPort = 3280;
	public static String WebRoot = (new File("")).getAbsolutePath() + "/WebRoot";

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		createServer().start();
	}

	protected static Server createServer() {
		System.out.println("------Start Server...");
		Server server = new Server(WebPort);
		WebAppContext webContext = new WebAppContext(WebRoot, "/");
		server.setHandler(webContext);
		return server;
	}

}
