package cn.duhongbiao.day07.summary;

import java.io.File;
import java.io.FileFilter;

/*创建过滤器的实现类*/
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) return true;
        return file.getName().toLowerCase().endsWith(".txt");
    }
}
