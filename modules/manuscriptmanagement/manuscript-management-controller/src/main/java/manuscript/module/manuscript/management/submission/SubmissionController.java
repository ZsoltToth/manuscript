package manuscript.module.manuscript.management.submission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import manuscript.module.manuscript.management.SubmissionService;
import manuscript.module.manuscript.management.submission.response.FileUploadResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller()
@RequestMapping("/submission")
public class SubmissionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SubmissionController.class);

	@Autowired
	private SubmissionService submissionService;

	@RequestMapping(value = "/uploadFile")
	public @ResponseBody FileUploadResponse uploadFileHandler(@RequestParam("file") MultipartFile file) {
		return submissionService.fileUpload(file);
	}
}
