package com.strategygameapp.repository;

import com.strategygameapp.model.MatchPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchPlayerRepository extends JpaRepository<MatchPlayer, Long> {
}
