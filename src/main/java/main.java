import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import action.HomeHeader;
import entity.Header;
import service.HeaderService;


public class main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated constructor stub
		
		
//		Properties defaultProps = new Properties();
//		FileInputStream in = new FileInputStream("C:\\Users\\Admin\\Desktop\\RiverCraneVietNam\\webike\\src\\main\\resources\\headers.properties");
//		defaultProps.load(in);
//		//InputStream inputStream = getClass().getClassLoader().getResourceAsStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\RiverCraneVietNam\\\\webike\\\\src\\\\main\\\\resources\\\\headers.properties");
//		System.out.println(defaultProps.getProperty("moto.honda","moto"));
//		System.out.println(defaultProps.values());
//		Collection<Object> arrayList =  defaultProps.values();
//		System.out.println(arrayList);
		
		
//		HeaderAction headerAction1 = HeaderAction.getInstance();
//		HeaderAction headerAction2 = HeaderAction.getInstance();
//		System.out.println(headerAction1);
//		System.out.println(headerAction2);
//		System.out.println(headerAction1.getInstance());
//		System.out.println(headerAction1.getHeaders());
//		System.out.println(headerAction2.getHeaders());
//		System.out.println(headerAction2.getHeaders());
		
		
//		List<String> matchingValues = defaultProps.entrySet().stream()
//                .filter(e -> e.getKey().toString().matches("moto.*"))
//                .map(e -> e.getValue().toString())
//                .collect(Collectors.toList());
//		
//		System.out.println(matchingValues);
//		in.close();
		HomeHeader header3 = HomeHeader.getInstance();
		HomeHeader header4 = HomeHeader.getInstance();
		HeaderService header1 = HomeHeader.getInstance();
		HeaderService header2 = HomeHeader.getInstance();
		System.out.println(header1.getHeaders());
		System.out.println(header2.getHeaders());
		System.out.println(header3);
		System.out.println(header4);
	}
}