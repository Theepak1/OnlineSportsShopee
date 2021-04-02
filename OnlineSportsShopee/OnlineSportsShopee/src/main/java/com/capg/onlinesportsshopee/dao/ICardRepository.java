package com.capg.onlinesportsshopee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capg.onlinesportsshopee.bean.Card;

@Repository
public interface ICardRepository extends JpaRepository<Card, Long>{

}
