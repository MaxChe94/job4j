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
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод поиска не пустых заявок
     * @return массив заявок, не равных null
     */
    public Item[] findAll(){
        Item[] currentItems = Arrays.copyOf(this.items,this.position);
        int size = 0;
        for (int i = 0; i < currentItems.length; i++){
            if (!currentItems[i].equals(null)) {
                currentItems[size] = currentItems[i];
                size++;
            }
        }
        return Arrays.copyOf(currentItems,size);
    }

    /**
     * Метод поиска заявок по имени
     * @return массив заявок с заданным именем
     */
    public Item[] findByName(String key){
        Item[] eqNameItems = Arrays.copyOf(this.items,this.position);
        int size = 0;
        for (int i = 0; i < eqNameItems.length; i++){
            if (eqNameItems[i].getName().equals(key)) {
                eqNameItems[size] = eqNameItems[i];
                size++;
            }
        }
        return Arrays.copyOf(eqNameItems,size);
    }

    /**
     * Метод поиска заявки по ее ключу
     * @return заявка, если не найдена - null.
     */
    public Item findById(String id){
        Item result = null;
        Item[] arr = Arrays.copyOf(this.items,this.position);
        for (Item i : arr) {
            if (i.getId().equals(id)){
                result = i;
            }
        }
        return result;
    }
}