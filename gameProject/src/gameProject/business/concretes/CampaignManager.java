package gameProject.business.concretes;

import java.util.List;

import gameProject.business.abstracts.CampaignService;
import gameProject.entities.Campaign;
import gameProject.entities.Product;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("The " + campaign.getName() + "campaing has been added with " + campaign.getDiscountRate() + "% discount rate.");
		
	}

	@Override
	public void applyCampaign(Campaign campaign, List<Product> products) {
		for(Product product : products) {
			product.setPrice(calculateDiscountedPrice(campaign, product));
		}
	}

	
	// business rules
	private double calculateDiscountedPrice(Campaign campaign, Product product) {
		double price = product.getPrice();
		return  price - ( price * ( campaign.getDiscountRate() / 100 ));
	}
}
