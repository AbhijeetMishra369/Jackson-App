package in.ashokit.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.data.Address;
import in.ashokit.data.Customer;

public class JavaToJsonConverter 
{

	public static void main(String[] args) throws Exception
	{
		Address add=new Address();
		add.setCountry("india");
		add.setState("odisha");
		add.setCity("Kendrapara");
		Customer c1=new Customer();
		c1.setId(111);
		c1.setName("sonu");
		c1.setEmail("abhijeet173@gmail.com");
		c1.setPhno(7978631865l);
		c1.setAddr(add);
		
		//To convert java data to Json data
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("Customer.json"), c1);
		System.out.println("Json file is created...");

	}

}
