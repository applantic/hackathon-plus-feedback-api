package pl.hackathon.plus.feedback.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

interface FeedbackStationRepository extends PagingAndSortingRepository<FeedbackStation, UUID> {
}
