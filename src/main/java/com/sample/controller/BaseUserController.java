package com.sample.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.dto.BaseUserDto;
import com.sample.form.BaseUserForm;
import com.sample.service.BaseUserService;

@Controller
@RequestMapping("baseUser")
public class BaseUserController {

    @Autowired
    BaseUserService baseUserService;

    @ModelAttribute
    BaseUserForm setUpForm() {
        return new BaseUserForm();
    }

    @GetMapping
    String list(Model model) {
        List<BaseUserDto> baseUsers = baseUserService.findAll();
        model.addAttribute("baseUsers", baseUsers);
        return "baseUser/list";
    }

    @PostMapping(path = "create")
    String create(@Validated BaseUserForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }
        BaseUserDto baseUser = new BaseUserDto();
        BeanUtils.copyProperties(form, baseUser);
        baseUserService.create(baseUser);
        return "redirect:/baseUser";
    }

    @GetMapping(path = "edit", params = "form")
    String editForm(@RequestParam String id, BaseUserForm form) {
        BaseUserDto baseUser = baseUserService.findById(id);
        BeanUtils.copyProperties(baseUser, form);
        return "baseUser/edit";
    }

    @PostMapping(path = "edit")
    String edit(@RequestParam String id, @Validated BaseUserForm form, BindingResult result) {
        if (result.hasErrors()) {
            return editForm(id, form);
        }
        BaseUserDto baseUser = new BaseUserDto();
        BeanUtils.copyProperties(form, baseUser);
        baseUserService.update(baseUser);
        return "redirect:/baseUser";
    }

    @GetMapping(path = "edit", params = "goToTop")
    String goToTop() {
        return "redirect:/baseUser";
    }

    @PostMapping(path = "delete")
    String delete(@RequestParam String id) {
        baseUserService.delete(id);
        return "redirect:/baseUser";
    }
}
