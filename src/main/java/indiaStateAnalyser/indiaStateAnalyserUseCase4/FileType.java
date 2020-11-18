package indiaStateAnalyser.indiaStateAnalyserUseCase4;

import org.apache.commons.io.FilenameUtils;

public class FileType {

	public static void checkFileType(String FILE_PATH) throws StateCensusException {
		String extension = FilenameUtils.getExtension(FILE_PATH);
		if(!extension.contains("csv"))
			throw new StateCensusException(StateCensusException.CensusExceptionType.EXTENSION_INVALID, "Extension Miss match");
	}
}
