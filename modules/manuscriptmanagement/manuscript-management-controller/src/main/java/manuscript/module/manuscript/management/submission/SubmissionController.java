package manuscript.module.manuscript.management.submission;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller()
@RequestMapping("/submission")
public class SubmissionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SubmissionController.class);

	@RequestMapping(value = "/uploadFile")
	public @ResponseBody String uploadFileHandler(@RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// File dir = new File("D:" + File.separator + "tmpFiles");
				// if (!dir.exists())
				// dir.mkdirs();

				File fileToSave = new File(
						"D:" + File.separator + "tmpFiles" + File.separator + file.getOriginalFilename());

				FileUtils.writeByteArrayToFile(fileToSave, bytes);
				LOGGER.debug("Go to the {} and check what happend...", fileToSave.getAbsolutePath());

				LOGGER.info("Server File Location=");

				return "You successfully uploaded file=";
			} catch (Exception e) {
				return "You failed to upload  => " + e.getMessage();
			}
		} else {
			return "You failed to upload because the file was empty.";
		}
	}

}
