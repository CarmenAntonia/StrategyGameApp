package com.strategygameapp.repository;

import com.strategygameapp.model.BoardCell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardCellRepository extends JpaRepository<BoardCell, Long> {
}
