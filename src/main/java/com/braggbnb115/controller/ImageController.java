package com.braggbnb115.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.braggbnb115.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.braggbnb115.domain.Image;
import com.braggbnb115.dto.ImageDTO;
import com.braggbnb115.dto.ImageSearchDTO;
import com.braggbnb115.dto.ImagePageDTO;
import com.braggbnb115.service.ImageService;
import com.braggbnb115.dto.common.RequestDTO;
import com.braggbnb115.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/image")
@RestController
public class ImageController {

	private final static Logger logger = LoggerFactory.getLogger(ImageController.class);

	@Autowired
	ImageService imageService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Image> getAll() {

		List<Image> images = imageService.findAll();
		
		return images;	
	}

	@GetMapping(value = "/{imageId}")
	@ResponseBody
	public ImageDTO getImage(@PathVariable Integer imageId) {
		
		return (imageService.getImageDTOById(imageId));
	}

 	@RequestMapping(value = "/addImage", method = RequestMethod.POST)
	public ResponseEntity<?> addImage(@RequestBody ImageDTO imageDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = imageService.addImage(imageDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/images")
	public ResponseEntity<ImagePageDTO> getImages(ImageSearchDTO imageSearchDTO) {
 
		return imageService.getImages(imageSearchDTO);
	}	

	@RequestMapping(value = "/updateImage", method = RequestMethod.POST)
	public ResponseEntity<?> updateImage(@RequestBody ImageDTO imageDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = imageService.updateImage(imageDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
