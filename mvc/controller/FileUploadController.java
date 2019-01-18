package com.lnt.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lnt.mvc.model.ScholarshipApplicationForm;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadController {
	
	 
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(
			@ModelAttribute("uploadForm") ScholarshipApplicationForm applicationform,
					Model map) {
		
		List<MultipartFile> files = applicationform.getFiles();

		List<String> fileNames = new ArrayList<String>();
		
		if(null != files && files.size() > 0) {
			for (MultipartFile multipartFile : files) {

				String fileName = multipartFile.getOriginalFilename();
				fileNames.add(fileName);
				//Handle file content - multipartFile.getInputStream()

			}
		}
		
		map.addAttribute("files", fileNames);
		return "file_upload_success";
	}
}


