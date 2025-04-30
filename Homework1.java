package org.example;

public class Homework1 {
    public static void main(String[] args) {
        // Возвращает длину строки (количество символов
        String city = "Москва";
        int result = city.length();
        System.out.println(result);

        //Возвращает true - true только если строка "" (длина 0), false - если строка не пустая.
        String a = "Москва";
        boolean result2 = a.isEmpty();
        System.out.println(result2);

        // Возвращает true если строка пустая или содержит только пробелы, false - если строка не пустая.
        String b = "Москва";
        boolean result3 = b.isBlank();
        System.out.println(result3);

        // Возвращается
        String c = "Москва";
        String result4 = c.substring(4);
        System.out.println(result4);

        // Возвращает Индекс первого вхождения подстроки str в исходной строке.
        String d = "Москва";
        int index = d.indexOf('g'); //символв g нет, выведется -1
        System.out.println(index);

        // Возвращает индекс последнего вхождения указанной подстроки str в строке.
        String f = "Москва";
        int index1 = f.lastIndexOf("москва"); // Регистр не совпадает
        System.out.println(index1); // Выведет -1

        //Используется для преобразования всех символов строки в нижний регистр (строчные буквы)
        String e = "МоСкВа";
        String result5 = e.toLowerCase();
        System.out.println(result5);

        //Используется для преобразования всех символов строки в верхний регистр (заглавные буквы)
        String g = "МоСкВа";
        String result6 = g.toUpperCase();
        System.out.println(result6);

        //Используется для замены всех вхождений указанной подстроки oldStr на новую подстроку newStr в исходной строке. Возвращает новую строку.
        String h = "Масква";
        String result7 = h.replace("Масква", "Москва");
        System.out.println(result7);

        //проверяет, начинается ли строка с указанной подстроки (префикса), и возвращает true или false
        String j = "Москва";
        boolean result8 = j.startsWith("М");
        System.out.println(result8);

        //Проверяет, заканчивается ли строка определенным подстроковым суффиксом
        String k = "Москва";
        boolean result9 = k.endsWith("М");
        System.out.println(result9);

        //позволяет создать новую строку, повторяющую исходную указанное количество раз
        String l = "Москва";
        String result10 = l.repeat(3);
        System.out.println(result10);

        //проверяет, содержится ли указанная подстрока внутри исходной строки
        String z = "Москва";
        boolean result11 = z.contains("10");
        System.out.println(result11);

        //объединяет текущую строку с указанной строкой-аргументом, возвращая новую строку
        String x = "Москва";
        String result12 = x.concat("10");
        System.out.println(result12);

        //удаляет все пробельные символы (пробелы, табуляции, переносы строк) в начале и конце строки
        String v = "Москва  ";
        String result13 = v.trim();
        System.out.println(result13);

        //сравнивает содержимое двух строк на идентичность
        String n = "Москва";
        boolean result14 = n.equals("Москва");
        System.out.println(result14);

    }
}
