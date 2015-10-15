package donatr.domain.account.command;

import donatr.domain.account.aggregate.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CreateAccountCommand {
	@TargetAggregateIdentifier
	private String id;
	private String name;
	private String email;
	private AccountType accountType;
}
