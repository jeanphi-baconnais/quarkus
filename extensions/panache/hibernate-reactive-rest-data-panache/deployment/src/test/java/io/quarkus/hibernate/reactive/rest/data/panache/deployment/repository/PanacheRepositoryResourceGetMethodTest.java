package io.quarkus.hibernate.reactive.rest.data.panache.deployment.repository;

import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.hibernate.reactive.rest.data.panache.deployment.AbstractGetMethodTest;
import io.quarkus.test.QuarkusUnitTest;

class PanacheRepositoryResourceGetMethodTest extends AbstractGetMethodTest {

    @RegisterExtension
    static final QuarkusUnitTest TEST = new QuarkusUnitTest()
            .withApplicationRoot((jar) -> jar
                    .addClasses(Collection.class, CollectionsResource.class, CollectionsRepository.class,
                            AbstractEntity.class, AbstractItem.class, Item.class, ItemsResource.class,
                            ItemsRepository.class, EmptyListItem.class, EmptyListItemsRepository.class,
                            EmptyListItemsResource.class)
                    .addAsResource("application.properties")
                    .addAsResource("import.sql"));
}
