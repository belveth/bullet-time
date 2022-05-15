import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HomeController() {

  @GetMapping("/")
  fun home(): String {
    return "home"
  }
}
