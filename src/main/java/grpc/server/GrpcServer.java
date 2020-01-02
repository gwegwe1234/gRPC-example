package grpc.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {
  public static void main(String[] args) {
    Server server = ServerBuilder
        .forPort(8081)
        .addService(new HelloServiceImpl()).build();
    try {
      server.start();
      server.awaitTermination();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e1) {
      e1.printStackTrace();
    }
  }
}
