package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    private Table table;

    public ClientHandler(Socket clientSocket, Table table) {
        this.clientSocket = clientSocket;
        this.table = table;
    }

    @Override
    public void run() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream());

            // Здесь обрабатывать запросы клиента и отправлять ему ответы в нужном формате.

            // Например, клиент может запросить следующие N строк начиная с указанного id.
            // Клиент также может отправлять запросы на добавление, обновление или удаление строк.
            // Все это должно обрабатываться в данном методе.

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

