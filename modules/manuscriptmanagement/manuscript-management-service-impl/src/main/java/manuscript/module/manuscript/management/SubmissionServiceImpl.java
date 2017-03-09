/**
 * 
 */
package manuscript.module.manuscript.management;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import manuscript.module.manuscript.management.exception.UploadedFileEmptyException;
import manuscript.module.manuscript.management.submission.request.SaveSubmissionRequest;
import manuscript.module.manuscript.management.submission.request.SubmitSubmissionRequest;
import manuscript.module.manuscript.management.submission.response.FileUploadResponse;
import manuscript.module.manuscript.management.submission.response.ManuscriptInformationResponse;
import manuscript.module.manuscript.management.submission.response.RemoveSubmissionResponse;
import manuscript.module.manuscript.management.submission.response.SaveSubmissionResponse;
import manuscript.module.manuscript.management.submission.response.SearchAuthorResponse;
import manuscript.module.manuscript.management.submission.response.SubmissionPreloadResponse;
import manuscript.module.manuscript.management.submission.response.SubmitSubmissionResponse;

/**
 * @author Balazs Kovacs
 *
 */
@Service
public class SubmissionServiceImpl implements SubmissionService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SubmissionServiceImpl.class);

	@Autowired (required = false)
	@Qualifier(value = "saveFilesFolder")
	private String saveFilesFolder;

	@Override
	public SubmissionPreloadResponse preload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileUploadResponse fileUpload(MultipartFile file) {
		FileUploadResponse fileUploadResponse = new FileUploadResponse();

		if (file.isEmpty()) {
			LOGGER.debug("File must not be empty.");
			throw new UploadedFileEmptyException("File must not be empty.");
		}
		saveFileOnFileSystem(file);

		return fileUploadResponse;
	}

	private void saveFileOnFileSystem(MultipartFile file) {
		String filePath;

		// AuthenticatedUser userDetails = (AuthenticatedUser)
		// SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		try {
			byte[] bytes = file.getBytes();
			filePath = saveFilesFolder + File.separator;

		} catch (IOException e) {
			// TODO: handle exception
		}

	}

	@Override
	public SaveSubmissionResponse saveSubmission(SaveSubmissionRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemoveSubmissionResponse removeSubmission(String submissionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubmitSubmissionResponse submitSubmission(SubmitSubmissionRequest requesst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchAuthorResponse searchAuthor(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManuscriptInformationResponse getManuscriptInformation(String submissionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
