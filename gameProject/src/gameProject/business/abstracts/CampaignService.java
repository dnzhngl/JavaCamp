package gameProject.business.abstracts;

import java.util.*;

import gameProject.entities.Campaign;
import gameProject.entities.Product;

public interface CampaignService {
	void add(Campaign campaign);
	void applyCampaign(Campaign campaign, List<Product> products);
}
