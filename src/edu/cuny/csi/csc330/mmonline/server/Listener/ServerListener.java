package edu.cuny.csi.csc330.mmonline.server.Listener;

import io.netty.buffer.ByteBuf;
import io.netty.util.CharsetUtil;
import io.scalecube.socketio.Session;
import io.scalecube.socketio.SocketIOListener;

public class ServerListener implements SocketIOListener {

	  @Override
	  public void onConnect(Session session) {
		  System.out.println(session.getSessionId() + " has connected.");
	  }

	  @Override
	  public void onMessage(Session session, final ByteBuf message) {
	
	    System.out.println("Received: " + message.toString(CharsetUtil.UTF_8));
	    
	    session.send(message);
	  }

	  @Override
	  public void onDisconnect(Session session) {
	    System.out.println(session.getSessionId() + " has disconnected.");
	  }

}
