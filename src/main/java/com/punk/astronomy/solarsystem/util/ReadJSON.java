package com.punk.astronomy.solarsystem.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

	static String path = "C:/Users/winst/eclipse-workspace/astronomy-solarsystem-data/src/main/resources/data.json";

	public JSONObject read() {
		String filePath = path;
		try
		{
			//Read JSON file
			Object obj = new JSONParser().parse(new FileReader(filePath));
			JSONObject jsonObj = (JSONObject) obj;

			return jsonObj;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
