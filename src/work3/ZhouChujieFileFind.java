package work3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ZhouChujieFileFind
{
    public List<String> res = new ArrayList<>();
    public void find (File root)
    {
        File[] sons = root.listFiles();
        if (sons == null) return;
        for (File son: sons)
        {
            if (son.isFile() && son.getName().split("\\.")[1].equals("txt"))
            {
                res.add(son.toString());
            } else
            {
                if (son.isFile() && son.getName().split("\\.")[1].equals("doc"))
                {
                    res.add(son.toString());
                } else
                {
                    find(son);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        //↓看着改
        ZhouChujieFileFind tfs = new ZhouChujieFileFind();
        //       下面要改成项目绝对路径{  ↓      ↓  }改完记得删掉这个注释
        tfs.find(new File("D:/program/JavaWork/src/work3/"));
        for (String file: tfs.res)
        {
            System.out.println(file);
        }
    }
}
