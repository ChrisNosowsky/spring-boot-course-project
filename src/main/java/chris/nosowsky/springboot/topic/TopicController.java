package chris.nosowsky.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {  // list gets converted to JSON automatically
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring Framework Description"),
				new Topic("Java", "Java Framework", "Java Framework Description"),
				new Topic("Javascript", "Javascript Framework", "Javascript Framework Description")
				);
	}

}
