package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="heroeConfig")
public class LuckyHeroeController {
	 
	String luckyHeroe;
	String preamble;
	
	@RequestMapping("/lucky-heroe")
	public String showLuckyHeroe() {
		return preamble + ": " + luckyHeroe;
	}

	public String getLuckyHeroe() {
		return luckyHeroe;
	}

	public void setLuckyHeroe(String luckyHeroe) {
		this.luckyHeroe = luckyHeroe;
	}

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}
	
}
