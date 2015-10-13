package donatr.domain.account.repository;

import org.axonframework.eventhandling.EventBus;
import org.axonframework.eventstore.EventStore;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Singleton
public class DonatrRepositoryProducer {
	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	EventStore eventStore;

	@Inject
	EventBus eventBus;


	@Produces @Singleton
	public AccountRepository getEventRepository() {
		System.out.println("init repository");
		return new AccountRepository(eventStore, eventBus, entityManager);
	}

	@Produces @Singleton
	public TransactionRepository getTransactionRepository() {
		System.out.println("init repository");
		return new TransactionRepository(eventStore, eventBus, entityManager);
	}
}
