package ru.variousvar.fileserver.operation.file;

import java.io.IOException;
import java.nio.file.Path;

public class FileSeparatorFileOperation implements FileOperation {
	@Override
	public Object operate(Path path) throws IOException {
		return System.getProperty("file.separator");
	}
}
