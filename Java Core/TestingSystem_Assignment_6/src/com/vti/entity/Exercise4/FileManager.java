package com.vti.entity.Exercise4;

import java.io.File;

public class FileManager {
    public static final String FILE_NOT_EXIST = "File/Folder does not exist!";
    public static final String FILE_EXIST = "File/Folder exists.";

    //Question1
    public static boolean isPathExists(String path) {
        File file = new File(path);
        return file.exists();
    }
}
