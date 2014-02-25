//Authors: Dave Hand and Joe Maco
import java.io.*;
import java.net.*;
import java.util.*;

public final class WebServer {
  public static void main(String[] args) throws Exception {

    //Set the port number
    int port = 6789;

    //Establish the listen socket
    ServerSocket listener = new ServerSocket(port);

    //Process HTTP service requests in an infinite loop
    while (true) {
      //Listen for a TCP connection request.
      Socket connectionRequests = listener.accept();

      //Construct an object to process the HTTP request message
      HttpRequest request = new HttpRequest(connectionRequests);
      
      //Create a new thread to process the request
      Thread thread = new Thread(request);

      //Start the thread
      thread.start();
    }
  }
}

final class HttpRequest implements Runnable {
  
}
