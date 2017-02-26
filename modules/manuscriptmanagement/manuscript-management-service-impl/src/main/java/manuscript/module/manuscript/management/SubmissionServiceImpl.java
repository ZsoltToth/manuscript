/**
 * 
 */
package manuscript.module.manuscript.management;

import org.springframework.stereotype.Service;
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
 * @author Balazs Kovacs
 *
 */
@Service
public class SubmissionServiceImpl implements SubmissionService {

	@Override
	public SubmissionPreloadResponse preload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileUploadResponse fileUpload(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
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
