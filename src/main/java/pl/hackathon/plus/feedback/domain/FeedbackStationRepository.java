package pl.hackathon.plus.feedback.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

interface FeedbackStationRepository extends CrudRepository<FeedbackStation, UUID> {
}
