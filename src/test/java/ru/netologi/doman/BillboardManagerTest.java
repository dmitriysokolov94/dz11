package ru.netologi.doman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {
    BillboardItem first = new BillboardItem(8, "Это - Англия", "драма, комедия, криминал");
    BillboardItem second = new BillboardItem(13, "Джентельмены", "криминал, комедия, боевик");
    BillboardItem third = new BillboardItem(3, "Старикам тут не место", "триллер, драма, криминал");
    BillboardItem fourth = new BillboardItem(1, "Тёмные воды", "трилер, драма, биография");
    BillboardItem fifth = new BillboardItem(38, "Криминальное чтиво", " криминал, драма");
    BillboardItem sixth = new BillboardItem(5, "Большой куш", "криминал, комедия, боевик");
    BillboardItem seventh = new BillboardItem(52, "Голяк", "комедия, криминал");
    BillboardItem eighth = new BillboardItem(10, "Форрест Гамп", "драма, комедия, мелодрама ");
    BillboardItem ninth = new BillboardItem(49, "Побег из Шоушенка", "драма");
    BillboardItem tenth = new BillboardItem(26, "Три билборда на границе Эббинга, Миссури", "драма, криминал ");


    @Test
    void findCustomBillboards() {
        BillboardManager manager = new BillboardManager(5);
        manager.addNewFilms(first);
        manager.addNewFilms(second);
        manager.addNewFilms(third);
        manager.addNewFilms(fourth);
        manager.addNewFilms(fifth);
        manager.findAll();

        BillboardItem[] actual = manager.findAll();
        BillboardItem[] expected = {first, second, third, fourth, fifth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findAllBillboards() {
        BillboardManager manager = new BillboardManager();
        manager.addNewFilms(first);
        manager.addNewFilms(second);
        manager.addNewFilms(third);
        manager.addNewFilms(fourth);
        manager.addNewFilms(fifth);
        manager.addNewFilms(sixth);
        manager.addNewFilms(seventh);
        manager.addNewFilms(eighth);
        manager.addNewFilms(ninth);
        manager.addNewFilms(tenth);
        manager.findAll();

        BillboardItem[] actual = manager.findAll();
        BillboardItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastCustomBillboards() {
        BillboardManager manager = new BillboardManager(5);
        manager.addNewFilms(first);
        manager.addNewFilms(second);
        manager.addNewFilms(third);
        manager.addNewFilms(fourth);
        manager.addNewFilms(fifth);
        manager.findAll();

        BillboardItem[] actual = manager.findLast();
        BillboardItem[] expected = {fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastALLBillboards() {
        BillboardManager manager = new BillboardManager();
        manager.addNewFilms(first);
        manager.addNewFilms(second);
        manager.addNewFilms(third);
        manager.addNewFilms(fourth);
        manager.addNewFilms(fifth);
        manager.addNewFilms(sixth);
        manager.addNewFilms(seventh);
        manager.addNewFilms(eighth);
        manager.addNewFilms(ninth);
        manager.addNewFilms(tenth);
        manager.findAll();

        BillboardItem[] actual = manager.findLast();
        BillboardItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findMoreLastCustomBillboards() {
        BillboardManager manager = new BillboardManager(5);
        manager.addNewFilms(first);
        manager.addNewFilms(second);
        manager.addNewFilms(third);
        manager.addNewFilms(fourth);
        manager.addNewFilms(fifth);
        manager.addNewFilms(sixth);
        manager.findAll();

        BillboardItem[] actual = manager.findLast();
        BillboardItem[] expected = {sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLessLastCustomBillboards() {
        BillboardManager manager = new BillboardManager(5);
        manager.addNewFilms(first);
        manager.addNewFilms(second);
        manager.addNewFilms(third);
        manager.addNewFilms(fourth);

        manager.findAll();

        BillboardItem[] actual = manager.findLast();
        BillboardItem[] expected = {fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findEquallyLastCustomBillboards() {
        BillboardManager manager = new BillboardManager(5);
        manager.addNewFilms(first);
        manager.addNewFilms(second);
        manager.addNewFilms(third);
        manager.addNewFilms(fourth);
        manager.addNewFilms(fifth);

        manager.findAll();

        BillboardItem[] actual = manager.findLast();
        BillboardItem[] expected = {fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
}