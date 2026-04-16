package org.santechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleCicdApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return " Welcome Msg updated!" ;
    }
    public static void main(String[] args) {

        SpringApplication.run(SampleCicdApplication.class, args);
    }
    /*git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/msandyareddy/github_actions_example.git
    git push -u origin main*/
}
