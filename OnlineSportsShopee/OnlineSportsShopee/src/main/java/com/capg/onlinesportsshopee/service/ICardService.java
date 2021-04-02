package com.capg.onlinesportsshopee.service;

import com.capg.onlinesportsshopee.bean.Card;
import com.capg.onlinesportsshopee.model.CardDTO;

public interface ICardService {
	
	public CardDTO addCard(Card card);
	
	public void removeCard(long id);

}


