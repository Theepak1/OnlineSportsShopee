package com.capg.onlinesportsshopee.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.onlinesportsshopee.bean.Card;
import com.capg.onlinesportsshopee.model.CardDTO;

public class CardUtil {
	
	public static Card convertToCard(CardDTO cardDto)
	{
		Card card = new Card();
		
		card.setId(cardDto.getId());
		card.setCardName(cardDto.getCardName());
		card.setCardNumber(cardDto.getCardNumber());
		card.setCardExpiry(cardDto.getCardExpiry());
		card.setCvv(cardDto.getCvv());
		
		return card;
	}
	
	public static CardDTO convertToCardDTO(Card card)
	{
		CardDTO cardDto = new CardDTO();
		
		cardDto.setId(card.getId());
		cardDto.setCardName(card.getCardName());
		cardDto.setCardNumber(card.getCardNumber());
		cardDto.setCardExpiry(card.getCardExpiry());
		cardDto.setCvv(card.getCvv());
		
		return cardDto;
	}
	
	public static List<CardDTO> convertToCardDtoList(List<Card> list)
	{
		List<CardDTO> cardDtoList = new ArrayList<CardDTO>();
		
		for(Card card : list)
			cardDtoList.add(convertToCardDTO(card));
		return cardDtoList;
			
	}

}
