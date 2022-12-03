package work3;
import java.io.*;
public class ZhouChujieCopyFile
{
    public static void main(String[] args) {
        //          下面要改成项目绝对路径{  ↓      ↓  }改完记得删掉这个注释
        File file = new File("D:/program/JavaWork/src/work3/file.txt");
        Reader r = null;
        char[] ch=new char[(int)file.length()];
        int temp,len=0,i=0;
        try {
            r = new FileReader(file);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try {
            while((temp=r.read())!=-1)
            {
                ch[i++] = (char)temp;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(ch,0,i));
    }
}
