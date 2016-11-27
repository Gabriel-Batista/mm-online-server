package edu.cuny.csi.csc330.mmonline.server.controller;

import io.netty.buffer.ByteBuf;
import io.scalecube.socketio.Session;
import io.scalecube.socketio.SocketIOAdapter;
import io.scalecube.socketio.SocketIOServer;


public class ServerController {
	
	public ServerController()
	{
			
		SocketIOServer echoServer = SocketIOServer.newInstance();
		
		echoServer.setListener(new SocketIOAdapter() {
			
			public void onMessage(Session session, ByteBuf message) {
				
			}
		});
		
		echoServer.start();
	}
}
