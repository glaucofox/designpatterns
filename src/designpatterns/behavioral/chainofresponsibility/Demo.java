package designpatterns.behavioral.chainofresponsibility;

import designpatterns.behavioral.chainofresponsibility.example.middleware.Middleware;
import designpatterns.behavioral.chainofresponsibility.example.middleware.RoleCheckMiddleware;
import designpatterns.behavioral.chainofresponsibility.example.middleware.ThrottlingMiddleware;
import designpatterns.behavioral.chainofresponsibility.example.middleware.UserExistsMiddleware;
import designpatterns.behavioral.chainofresponsibility.example.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    /**
     * Demo class. Everything comes together here.
     */
    public static void init()
    {

        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various 
        // chains using the same components
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                  .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);

    }

    public static void main(String[] args) throws IOException 
    {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");;
            String email = reader.readLine();
            System.out.println("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
