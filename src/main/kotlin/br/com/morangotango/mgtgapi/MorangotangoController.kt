package br.com.morangotango.mgtgapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HtmlController {

  @GetMapping("/")
  fun blog(): String {
    return "blog"
  }

}