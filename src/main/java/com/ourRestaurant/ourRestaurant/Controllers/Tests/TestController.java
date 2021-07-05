package com.ourRestaurant.ourRestaurant.Controllers.Tests;

import com.ourRestaurant.ourRestaurant.DAOs.Tests.TestDAO;
import com.ourRestaurant.ourRestaurant.Services.Tests.PapagoCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/api")
@RestController
public class TestController {
    @Autowired
    private TestDAO testDAO;

    @PostMapping("/ip")
    public ResponseEntity<String> ip(HttpServletRequest request) {
        // 요청을 보낸 클라이언트의 IP주소를 반환합니다.
        return ResponseEntity.ok(request.getRemoteAddr());
    }

    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd 물음표 뒤부터가 파라미터터
    public String getParameter(@RequestParam String id, @RequestParam String password){

        //만약에 여기서 password라는 변수가 쓰인다면 매개변수는 다른 이름으로 password를 받아야함.
        //그렇게 되면 매핑이 안되므로 @RequestParam(name = "password") pwd이렇게 해주면
        // 들어오는 인자는 password라는 이름으로 매핑될거야 라는 뜻.
        System.out.println("id ->"+id);
        System.out.println("password ->"+password);
        System.out.println("Jinhak First Code");

        return id+password; //여기서 return 한 것들이 web에 띄워짐

    }

    @GetMapping("/getPapagoAnswer")
    public String getPapagoAnswer(@RequestParam String queryMessage){
        PapagoCall papagoCall = new PapagoCall();
        return papagoCall.execute(queryMessage);
    }

    @GetMapping("/getTestSql")
    public String getTestSql(){
        return testDAO.selectTest().getTest();
    }
}

//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//public class TestController {
//    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd 물음표 뒤부터가 파라미터터
//    public String getParameter(@RequestParam String id, @RequestParam String password){
//
//        //만약에 여기서 password라는 변수가 쓰인다면 매개변수는 다른 이름으로 password를 받아야함.
//        //그렇게 되면 매핑이 안되므로 @RequestParam(name = "password") pwd이렇게 해주면
//        // 들어오는 인자는 password라는 이름으로 매핑될거야 라는 뜻.
//        System.out.println("id :"+id);
//        System.out.println("password :"+password);
//
//        return id+password; //여기서 return 한 것들이 web에 띄워짐
//
//    }
//}