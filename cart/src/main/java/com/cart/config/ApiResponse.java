package com.cart.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiResponse {
	 private String message;
	    JSONArray array=null;
	    HashMap<String,String> data=null;
	    JSONObject jsonobj=null;
	    private List<String> errors;
 	public ApiResponse( String message, List<String> errors) {
	        super();
	        //this.status = status;
	        this.message = message;
	        this.errors = errors;
	    }
 	
		public ApiResponse( HashMap<String,String> data) {
		       this.data = data;
		}
		public ApiResponse( JSONArray array) {
		       this.array = array;
		}
		public ApiResponse( JSONObject jsonobj) {
		       this.jsonobj = jsonobj;
		}
	 
	    public ApiResponse( String message, String error) {
	        super();
	        //this.status = status;
	        this.message = message;
	        errors = Arrays.asList(error);
	    }
	    public ApiResponse( String message, String Reason,String error_code) {
	        super();
	        //this.status = status;
	        this.message = message;
	        errors = Arrays.asList(error_code);
	    }


		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<String> getErrors() {
			return errors;
		}

		public void setErrors(List<String> errors) {
			this.errors = errors;
		}
		
		public HashMap<String, String> getData() {
			return data;
		}
		public void setData(HashMap<String, String> data) {
			this.data = data;
		}
		public JSONArray getArray() {
			return array;
		}
		public void setArray(JSONArray array) {
			this.array = array;
		}
		public JSONObject getJsonobj() {
			return jsonobj;
		}
		public void setJsonobj(JSONObject jsonobj) {
			this.jsonobj = jsonobj;
		}
}
