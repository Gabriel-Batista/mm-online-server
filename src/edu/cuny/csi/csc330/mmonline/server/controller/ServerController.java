package edu.cuny.csi.csc330.mmonline.server.controller;

import io.scalecube.socketio.ServerConfiguration;
import io.scalecube.socketio.SocketIOServer;
import edu.cuny.csi.csc330.mmonline.server.Listener.*;

public class ServerController {
	
	public ServerController()
	{
	
		ServerConfiguration config = ServerConfiguration.builder()
				.port(8080)
				.eventExecutorEnabled(false)
				.build();
		
		SocketIOServer echoServer = SocketIOServer.newInstance(config);
		
		echoServer.setListener(new ServerListener());
		
		echoServer.start();
	}
}
