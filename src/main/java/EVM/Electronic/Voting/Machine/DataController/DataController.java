package EVM.Electronic.Voting.Machine.DataController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import EVM.Electronic.Voting.Machine.Entity.Commissioner;
import EVM.Electronic.Voting.Machine.Entity.Parties;
import EVM.Electronic.Voting.Machine.Entity.Voter;
import EVM.Electronic.Voting.Machine.Service.DataService;
import java.util.List;
@Controller
public class DataController {
	
	@Autowired
	DataService service;
	@GetMapping("/main")
	public String home()
	{
		return "Home";
	}
	
	@GetMapping("/voterlogin")
	public String voterlogin()
	{
		return "voterlogin";
	}
	
	@PostMapping("/voterlogin")
	public String voterlogin2(@ModelAttribute Voter v)
	{
		if(service.insertvoter(v))
		{
			
			return "redirect:/votingpage";
		}
		else
		{
			return "redirect:/alreadyvoted";
		}
	}
	
	
	@GetMapping("/alreadyvoted")
	public String alreadyvoted()
	{
		return "alreadyvoted";
	}
	
	@GetMapping("/votingpage")
	public String votingpage()
	{
		return "votingpage";
	}
	
	
	@PostMapping("/votingpage")
	public String votingpage2(@ModelAttribute Parties p)
	{
		service.insertvote(p);
		return "redirect:/main";
	}
	@GetMapping("/clogin")
	public String clogin()
	{
		return "clogin";
	}
	
	@PostMapping("/clogin")
	public String clogin2(@ModelAttribute Commissioner c)
	{
		if(service.validate(c))
		{
			
			
			return "redirect:/result";
		}
		else
		{
			return "redirect:/clogin";
		}
	}
	
	@GetMapping("/result")
	public String result(Model model)
	{
	List<Parties>  result=service.getresult();
	model.addAttribute("result", result);
		return "result.html";
	}
	
}