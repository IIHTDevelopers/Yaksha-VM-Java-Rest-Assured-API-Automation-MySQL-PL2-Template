package coreUtilities.utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileOperations {
	public JSONParser jsonParser;
	public JSONObject jsonObject;
	public Fillo fillo;
	public Connection connection;
	public Properties properties;

	/**
	 * This method is useful to read the json file based on the Filename It'll
	 * return the json object as {@link Map}
	 * 
	 * @param jsonFilePath - {@link String}
	 * @return {@link Map}
	 * @throws Exception
	 */
	public Map<String, String> readJson(String jsonFilePath) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			// Read the JSON file and convert it to a Map<String, String>
			return objectMapper.readValue(new File(jsonFilePath), new TypeReference<Map<String, String>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to read JSON file: " + jsonFilePath, e);
		}
	}

	/**
	 * This method is useful to read the excel sheet based on the Filename and sheet
	 * name. It'll return the values for the respective sheet in {@link Map} where
	 * the first column name as a key and the value as per the value entered in
	 * second column.
	 * 
	 * @param excelFilePath - {@link String} excel sheet location
	 * @param sheetName     - {@link String} Sheet name to read the excel
	 * @return {@link Map}
	 * @throws Exception
	 */
	public Map<String, String> readExcelPOI(String excelFilePath, String sheetName) throws Exception {
		// write your logic here and return the object
		return null;
	}

}