package jp.co.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.test.form.TestForm;
import jp.co.test.mapper.UserMapper;
import jp.co.test.repository.UserRepository;

@RestController
public class UserController {

  private final UserRepository repository;
  private final UserMapper userMapper;

  @Autowired
  public UserController(UserRepository repository) {
    this.repository = repository;
	this.userMapper = null;
  }

  @RequestMapping("/")
  public String user() {
    return String.valueOf(repository.findAll());
  }
  
  @RequestMapping("/gettest")
  public String gettest() {
    return "aaaaa";
  }
  
  
  @RequestMapping("/formtest")
  public String formtest(@ModelAttribute TestForm testForm, Model model) {
	model.addAttribute("TestForm", testForm);
    return "TestForm" + testForm.getId() + testForm.getContent();
  }
}