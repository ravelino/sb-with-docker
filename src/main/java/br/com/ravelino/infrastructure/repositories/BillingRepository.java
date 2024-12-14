package br.com.ravelino.infrastructure.repositories;

import br.com.ravelino.infrastructure.entities.Billing;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface BillingRepository extends CrudRepository<Billing, BigDecimal>
{
}
