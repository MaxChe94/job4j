package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add (Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId () {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод поиска не пустых заявок
     *
     * @return массив заявок, не равных null
     */
    public Item[] findAll () {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод поиска заявок по имени
     *
     * @return массив заявок с заданным именем
     */
    public Item[] findByName (String key) {
        Item[] eqNameItems = new Item[position];
        int size = 0;
        for (int i = 0; i < eqNameItems.length; i++) {
            if ((items[i].getName()).equals(key)) {
                eqNameItems[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(eqNameItems, size);
    }

    /**
     * Метод замены заявки по ее ключу
     *
     * @return новая заявка, если не найдена - null.
     */
    public boolean replace (String id, Item newItem) {
        boolean result = false;
        int index = -1;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index != (-1)) {
            newItem.setId(id);
            this.items[index] = newItem;
            result = true;
        }
        return result;
    }


    /**
     * Метод поиска заявки по ее ключу
     *
     * @return заявка, если не найдена - null.
     */
    public Item findById (String id) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }

        }
        return result;
    }

    /**
     * Метод удаления заявки по ее ключу
     *
     * @return удалённая заявка, если не найдена - null.
     */
    public boolean delete (String id) {
        boolean result = false;
        int index = -1;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index != (-1)) {
            for (int i = index; i < (position - 1); i++) {
                items[i] = items[i + 1];
            }
            items[position - 1] = null;
            position -= 1;
            result = true;
        }
        return result;
    }

}