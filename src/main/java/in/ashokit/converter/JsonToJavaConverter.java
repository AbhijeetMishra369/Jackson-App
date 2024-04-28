package in.ashokit.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.data.Customer;

public class JsonToJavaConverter 
{

	public static void main(String[] args) throws Exception 
	{
		File f=new File("Customer.json");
		ObjectMapper mapper=new ObjectMapper();
		Customer c=mapper.readValue(f,Customer.class);
		System.out.println(c);

	}

}
