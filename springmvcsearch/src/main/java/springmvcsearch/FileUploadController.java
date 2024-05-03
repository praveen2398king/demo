package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String uploadForm() {

		return "fileform";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String uploadImage(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {

		byte[] bytes = file.getBytes();

		// we have to save this file to server
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "image" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			m.addAttribute("msg", "uploaded successfully");
			m.addAttribute("filename",file.getOriginalFilename() );

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			m.addAttribute("msg", "uploading error");

		}

		return "filesuccess";
	}

}
