package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Table table;

    public Server() {
        table = new Table();
        // Здесь можно инициализировать таблицу, если есть начальные данные.
    }

    public void start(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Создаем отдельный поток для обработки запроса каждого клиента.
                ClientHandler clientHandler = new ClientHandler(clientSocket, table);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = 12345; // Порт, на котором будет слушать сервер.
        Server server = new Server();
        server.start(port);
    }
}
