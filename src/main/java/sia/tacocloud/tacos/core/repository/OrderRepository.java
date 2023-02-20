package sia.tacocloud.tacos.core.repository;

import sia.tacocloud.tacos.core.domain.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
