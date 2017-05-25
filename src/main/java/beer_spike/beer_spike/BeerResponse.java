package beer_spike.beer_spike;

import java.util.List;

public class BeerResponse {

	private int currentPage;
	private int numberOfPages;
	private int totalResults;

	private List<Beer> data;

	public List<Beer> getData() {
		return data;
	}

	public void setData(List<Beer> beers) {
		this.data = beers;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
}
