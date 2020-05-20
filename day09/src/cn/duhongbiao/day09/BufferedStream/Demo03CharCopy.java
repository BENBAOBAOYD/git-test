package cn.duhongbiao.day09.BufferedStream;

import java.io.*;

public class Demo03CharCopy {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\file\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java\\file\\flies\\a.txt"))){
            String strings = null;
            while ((strings = br.readLine()) != null) {
                bw.write(strings,0,strings.length());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
