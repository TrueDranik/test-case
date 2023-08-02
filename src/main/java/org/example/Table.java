package org.example;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private Map<Integer, Row> data;

    public Table() {
        data = new HashMap<>();
    }

    // Методы для добавления, обновления и удаления строк из таблицы
    public void addRow(Row row) {
        data.put(row.getId(), row);
    }

    public void updateRow(Row row) {
        data.put(row.getId(), row);
    }

    public void deleteRow(int id) {
        data.remove(id);
    }

    // Метод для получения N строк, начиная с заданного Id
    public Row[] getRowsFromId(int startId, int n) {
        // Логика получения N строк начиная с заданного идентификатора
        // Можно реализовать разные стратегии, например, выдачу следующих N строк
        // после указанного id и так далее.
        return new Row[0];
    }

    // Дополнительные методы по работе с таблицей
}

