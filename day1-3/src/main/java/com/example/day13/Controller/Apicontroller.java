package com.example.day13.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
	public String color="green";
@GetMapping("affrin")
public String getMyFav()
{
	return "My fav colour is "+color;
}

}
