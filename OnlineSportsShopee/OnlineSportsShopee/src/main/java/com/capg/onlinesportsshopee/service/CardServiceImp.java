package com.capg.onlinesportsshopee.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.onlinesportsshopee.bean.Card;
import com.capg.onlinesportsshopee.dao.ICardRepository;
import com.capg.onlinesportsshopee.exceptions.CardServiceException;
import com.capg.onlinesportsshopee.model.CardDTO;
import com.capg.onlinesportsshopee.util.CardUtil;

@Service
public class CardServiceImp implements ICardService {
	
	@Autowired
	ICardRepository cardRepository;

	@Override
	public CardDTO addCard(Card card) throws CardServiceException {
		Optional<Card> cardTemp = cardRepository.findById(card.getId());
		if(cardTemp.isEmpty())
		{
			Card addCard = cardRepository.save(card);
			return CardUtil.convertToCardDTO(addCard);
		}
		else
		{
			throw new CardServiceException("Card is already exist");
		}
	}

	@Override
	public void removeCard(long id) throws CardServiceException {
		Optional<Card> cardTemp = cardRepository.findById(id);
		if(cardTemp.isEmpty())
		{
			throw new CardServiceException("Card does not exist to delete");
		}
		else
		{
			cardRepository.delete(cardTemp.get());
			//return CardUtil.convertToCardDTO(cardTemp.get());
		}

	}
	
	/*
	 * public static boolean validateCardName(Card card) { boolean flag = false ;
	 * if(card.getCardName() != null && card.getCardName().length() > 4 &&
	 * card.getCardName().equals(card.getCardName().toUpperCase())) { flag = true ;
	 * } else { flag = false ; } return flag; }
	 * 
	 * public static boolean validateCardNumber(Card card) { boolean flag = false;
	 * if(card.getCardNumber().length() == 16 &&
	 * Pattern.matches("^[0-9]&",card.getCardNumber()) ) { flag = true; } else {
	 * flag = false; } return flag; }
	 * 
	 * public static boolean validateCvv(Card card) { boolean flag = false; if
	 * (card.getCvv() >= 100 && card.getCvv() <= 999 ) { flag = true; } else { flag
	 * = false; } return flag;
	 * 
	 * }
	 * 
	 * public static boolean validateCardExpiry(Card card) { boolean flag = false;
	 * if(card.getCardExpiry() != null &&
	 * card.getCardExpiry().isAfter(LocalDate.now())) { flag = true; } else { flag =
	 * false; } return flag; }
	 */
	/*
	 * public static boolean validateCardNumber2(Card card) {
	 * 
	 * boolean flag = false;
	 * 
	 * String regex = "^[0-9]&"; Pattern pattern = Pattern.compile(regex);
	 * if(pattern.matcher(card.getCardNumber()).matches() && card.getCardNumber() !=
	 * null || !card.getCardNumber().isEmpty()) { flag = true; } return flag; }
	 */
}
