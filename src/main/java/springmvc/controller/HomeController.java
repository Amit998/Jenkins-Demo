package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.Calculator;
import springmvc.model.MyServices;

@Controller

public class HomeController {




	@RequestMapping("/")
	public String index() {

		return "index";
	}
	
	@RequestMapping(path="/home")
	public String home() {

		return "index";
	}
	

	
	@RequestMapping(path="/calculate")
	public String calculate(Model model) {
		
		
		model.addAttribute("isEmpty","false");
		System.out.println("This is calculate");
		return "calculate";
	}
	
	
	@RequestMapping(path="/calculate",method = RequestMethod.POST)
	public String calculate(@RequestParam("btn") String value,@ModelAttribute Calculator cal,Model model) {
		
		
//		System.out.println(cal.getfNumber()+cal.getsNumber()+value);
		
		if (cal.getfNumber().equals("") || cal.getsNumber().equals("")) {
			model.addAttribute("isEmpty","true");
			model.addAttribute("errMsg","Empty Field");
		}else {
			double result=getCalCulation(Double.parseDouble(cal.getfNumber()),Double.parseDouble(cal.getsNumber()),value);
			model.addAttribute("isEmpty","false");
			System.out.println(result+"");
			model.addAttribute("calculatedValue",result);
			
		}
		
		return "calculate";
	}
	
	public double getCalCulation(Double num1,Double num2,String op) {
		MyServices myServices=new MyServices();
		
		
		if (op.equals("+")) {
			//System.out.println("+");
			return myServices.add(num1, num2);
			
		}else if (op.equals("-")) {
			//System.out.println("-");
			return myServices.sub(num1, num2);
			
		}else if (op.equals("/")) {
			//System.out.println("/");
			return myServices.div(num1, num2);
				
		}else if (op.equals("*")) {
			//System.out.println("*");
			return myServices.mul(num1, num2);
		}
		
		return 0;
		
		
	}


}
