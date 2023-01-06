package com.punk.astronomy.solarsystem.controllers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.punk.astronomy.solarsystem.util.ReadJSON;

@RestController
@RequestMapping("/api/astro")
public class DataController {

	@GetMapping("/datatest")
	public String test() {
		return "Data Controller OK";
	}

	@GetMapping("/data")
	public JSONArray listPlanets() {
		ReadJSON readJSON = new ReadJSON();
		JSONObject jsonObject = readJSON.read();

		JSONArray planets = (JSONArray) jsonObject.get("planets");
	
		return planets;
	}
}
