package com.metavirtual.bloom.mailVerification;

import com.metavirtual.bloom.user.model.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Logger;

@Controller
@RequiredArgsConstructor
public class MailController {

    Logger log;

    private final MailService mailService;

    @ResponseBody
    @PostMapping("/mail")
    public String MailSend(String mail){

        int number = mailService.sendMail(mail);
        String num = "" + number;
        return num;
    }



    @PostMapping("/mail/findId")
    public String sendId(@RequestParam("name") String name, @RequestParam("email") String email
            , @ModelAttribute UserDTO userDTO) {
        String findDetails = mailService.findDetails(name, email);

        // Check the result and return appropriate view
        if ("이름 또는 이메일이 존재하지 않습니다".equals(findDetails)) {
            return "/user/userNotFoundView";
        } else {
            return "/user/verificationIdSent";
        }
    }

}