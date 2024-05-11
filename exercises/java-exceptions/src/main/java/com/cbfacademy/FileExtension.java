package com.cbfacademy;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FileExtension {
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("File name cannot be null or empty.");
        }
        return filename.endsWith(".java");
    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String filename : filenames) {
            try {
                boolean hasJavaExtension = check(filename);
                resultMap.put(filename, hasJavaExtension ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(filename, -1);
            }
        }
        return resultMap;
    }
}