## Spring-Boot---Unit-Testing-Repository-Layer

## Given_When_Then - Naming convention for writing method name
`
@Test
public void given_when_then()
{
    // Given : Setup object or precondition

    // When : Action of behavious that we are going to test

    // Then : Verify the output
}

`

## Annotaion details

# @DataJpaTest
The @DataJpaTest annotation in Spring Boot is used for integration testing of JPA repositories. It provides a convenient way to test the persistence layer of your application by automatically configuring an in-memory database, creating a TestEntityManager, and setting up a transactional test environment.
It will only load Repository layer.



