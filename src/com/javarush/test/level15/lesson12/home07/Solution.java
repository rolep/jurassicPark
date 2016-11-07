package com.javarush.test.level15.lesson12.home07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Файл в статическом блоке
1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
3. Закрой поток ввода методом close().
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static
    {
        try
        {
            FileInputStream input = new FileInputStream(Constants.FILE_NAME);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = null;
            while (true)
            {
                s = reader.readLine();
                if (s == null) break;
                lines.add(s);
            }
            reader.close();
            input.close();
        }
        catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
