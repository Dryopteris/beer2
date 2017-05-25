package beer_spike.beer_spike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

@RestController
public class BeerController {

	@Autowired
	private BeerClient client;

	@RequestMapping("/{styleId}")
	public List<String> getBeers(@PathVariable String styleId) {

		List<Beer> beers = this.client.queryBeers(styleId);
		List<String> beerNames = Lists.<String> newArrayList();
		for (Beer beer : beers) {
			beerNames.add(beer.getName());
		}
		System.out.println(beerNames);
		return beerNames;
	}

}
