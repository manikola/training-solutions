package stringmethods;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty string");
        }
        str = str.trim();
        return str.charAt(str.length() - 1);
    }
    public String findFileExtension(String fileName) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Filename invalid");
        }
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');
        if (index < 1 || index == fileName.length() - 1) {
            throw new IllegalArgumentException("Filename invalid");
                    }
        return fileName.substring(index);
    }
    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (isEmpty(ext) || isEmpty(fileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        fileName = fileName.trim();
        ext = ext.trim();
        int index = fileName.lastIndexOf('.');
        if (index < 1 || index == fileName.length() -1) {
            throw new IllegalArgumentException("Invalis argument!");
        }
        return fileName.endsWith(ext);
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (isEmpty(searchedFileName) || isEmpty(actualFileName)) {
            throw new IllegalArgumentException("Invalid argument!");
                    }
        searchedFileName = searchedFileName.trim();
        actualFileName = actualFileName.trim();

        return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string");
        }
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');
        if ( index < 1 || index == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid argument");
        }
        String firstPart = fileName.substring(0, index);
        String ext = fileName.substring(index);
        return firstPart + ext.toLowerCase();

    }
    public String replaceStringPart(String fileName, String present, String target) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }

        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }


    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
