package utils;

/**
 * Enumeration of supported file formats for data export.
 * Each format contains file extension information.
 */
public enum FileType {

    /**
     * Comma-Separated Values format.
     * Text format for representing tabular data.
     */
    CSV(".csv");

    private final String fileFormat;

    /**
     * Creates a file type with the specified extension.
     *
     * @param fileFormat file extension.
     */
    FileType(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * Returns the file extension for this format.
     *
     * @return file extension string including the dot.
     */
    public String getFileFormat() {
        return fileFormat;
    }
}
