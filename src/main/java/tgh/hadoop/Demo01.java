package tgh.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class Demo01 {

    public static void main(String[] args) throws Exception {

        Configuration config = new Configuration();
        config.set("dfs.replication","1");

        FileSystem fs = FileSystem.get(new URI("hdfs://119.23.191.109:8020"),config,"root");

        fs.copyFromLocalFile(new Path("D:\\user\\89006376\\我的文档\\MeetNowInstall.log"),new Path("/java_test"));


        System.out.println("HDFS上传文件成功");
    }
}
