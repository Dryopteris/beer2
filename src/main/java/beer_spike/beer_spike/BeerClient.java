package beer_spike.beer_spike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.common.collect.Lists;

@Component
public class BeerClient {

	@Autowired
	private RestTemplate restTemplate;

	public List<Beer> queryBeers(String styleId) {

		String url = "http://api.brewerydb.com/v2/beers?key=f73a0056b32d3a6840767ee3af3a83c3&styleId=" + styleId;
		ResponseEntity<BeerResponse> response = this.restTemplate.getForEntity(url, BeerResponse.class);
		BeerResponse beerResponse = response.getBody();
		List<Beer> beers = Lists.<Beer> newArrayList(beerResponse.getData());
		return beers;
	}

}
