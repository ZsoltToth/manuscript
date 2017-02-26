package manuscript.module.manuscript.management;

import org.springframework.web.multipart.MultipartFile;

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
 * 
 * @author Balazs Kovacs
 *
 */
public interface SubmissionService {

	/**
	 * Get all started, but not submitted manuscripts of the user and all
	 * necessary information what used by submission menu.
	 * 
	 * @return SubmissionPreloadResponse
	 */
	public SubmissionPreloadResponse preload();

	/**
	 * Start the submission process.
	 * 
	 * @param file
	 * @return FileUploadResponse
	 */
	public FileUploadResponse fileUpload(MultipartFile file);

	/**
	 * Update the appropriate not submitted manuscript in the database.
	 * 
	 * @return SaveSubmissionResponse
	 * @param request
	 */
	public SaveSubmissionResponse saveSubmission(SaveSubmissionRequest request);

	/**
	 * Remove the appropriate not submitted manuscript from the database and all
	 * additional files from the file system.
	 * 
	 * @param submissionId
	 * @return RemoveSubmissionResponse
	 */
	public RemoveSubmissionResponse removeSubmission(String submissionId);

	/**
	 * Submit an appropriate Manuscript. After submit process the manuscript is
	 * going to unmodifiable and going to remove the temporary table. The
	 * submitted manuscript will be available for all co-author.
	 * 
	 * @param requesst
	 * @return SubmitSubmissionResponse
	 */
	public SubmitSubmissionResponse submitSubmission(SubmitSubmissionRequest requesst);

	/**
	 * Get details of co-author.
	 * 
	 * @param email
	 * @return SearchAuthorResponse
	 */
	public SearchAuthorResponse searchAuthor(String email);

	/**
	 * Get information about a manuscript by submissionId.
	 * 
	 * @param submissionId
	 * @return ManuscriptInformationResponse
	 */
	public ManuscriptInformationResponse getManuscriptInformation(String submissionId);
}
