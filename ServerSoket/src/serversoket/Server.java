/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serversoket;
import java.net.*;
import java.io.*;
/**
 *
 * @author panzeri.tommasoambro
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       serverSocket = new ServerSocket();
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
            if ("hello server".equals(greeting)) {
                out.println("hello client");
            }
            else {
                out.println("unrecognised greeting");
            }
    }
    
}
