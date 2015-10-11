package donatr.common.event;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class AccountDebitedEvent {
	private String id;
	private String accountId;
	private BigDecimal amount;
}
