package com.OPC.practiceExamples;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopier {

    public  static void copy1(Path p1, Path p2)throws Exception{
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);

    }

    public static void main(String[] args) throws Exception {
    var p1 = Paths.get("C:\\Users\\girwa\\OneDrive\\Desktop\\Test\\1.txt");
    var p2 = Paths.get("C:\\Users\\girwa\\OneDrive\\Desktop\\Test\\2.txt");
    copy1(p1, p2);
    if(Files.isSameFile(p1, p2)){
        System.out.println("files Copied");
    }else {
        System.out.println("unable to copy files");
    }
    }
}
