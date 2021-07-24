package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.Calculator;

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
		
		if (cal.getfNumber()=="" || cal.getsNumber()=="") {
			model.addAttribute("isEmpty","true");
			model.addAttribute("errMsg","Empty Field");
		}else {
			double result=getCalCulation(Integer.parseInt(cal.getfNumber()),Integer.parseInt(cal.getsNumber()),value);
			model.addAttribute("isEmpty","false");
			System.out.println(result+"");
			model.addAttribute("calculatedValue",result);
			
		}
		
		return "calculate";
	}
	
	public double getCalCulation(int num1,int num2,String op) {
		
		
		
		if (op.equals("+")) {
			//System.out.println("+");
			return num1+num2;
			
		}else if (op.equals("-")) {
			//System.out.println("-");
			return num1-num2;
			
		}else if (op.equals("/")) {
			//System.out.println("/");
			return num1/num2;
				
		}else if (op.equals("*")) {
			//System.out.println("*");
			return num1*num2;
		}
		
		return 0;
		
		
	}


}
