package com.ggalantecode.springboothibernatejpaprova;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(schema = "myschema", name = "prova_primary_key_gen")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProvaPrimaryKeyGenEntity {

    /*

    https://thorben-janssen.com/jpa-generate-primary-keys/
    Technical IDs are easier to manage and all involved systems, mainly the database and Hibernate, can index
    them very efficiently. This allows you to focus on the business logic of your application and avoids
    performance issues.

    The GenerationType.AUTO is the default generation type and lets the persistence provider choose the
    generation strategy. If you use Hibernate as your persistence provider, it selects a generation strategy
    based on the database specific dialect. For most popular databases, it selects GenerationType.SEQUENCE
    which I will explain later.

    The GenerationType.IDENTITY is the easiest to use but not the best one from a performance point of view.
    It relies on an auto-incremented database column and lets the database generate a new value with each
    insert operation. From a database point of view, this is very efficient because the auto-increment columns
    are highly optimized, and it doesn’t require any additional statements. This approach has a significant
    drawback if you use Hibernate. Hibernate requires a primary key value for each managed entity and therefore
    has to perform the insert statement immediately. This prevents it from using different optimization
    techniques like JDBC batching.

    The GenerationType.SEQUENCE is my preferred way to generate primary key values and uses a database sequence
    to generate unique values. It requires additional select statements to get the next value from a database
    sequence. But this has no performance impact for most applications. And if your application has to persist
    a huge number of new entities, you can use some Hibernate specific optimizations to reduce the number of
    statements. If you don’t provide any additional information, Hibernate will request the next value from
    its default sequence. You can change that by referencing the name of a @SequenceGenerator in the generator
    attribute of the @GeneratedValue annotation. The @SequenceGenerator annotation lets you define the name of
    the generator, the name, and schema of the database sequence and the allocation size of the sequence.

    The GenerationType.TABLE gets only rarely used nowadays. It simulates a sequence by storing and updating
    its current value in a database table which requires the use of pessimistic locks which put all
    transactions into a sequential order. This slows down your application, and you should, therefore, prefer
    the GenerationType.SEQUENCE, if your database supports sequences, which most popular databases do. You can
    use the @TableGenerator annotation in a similar way as the already explained @SequenceGenerator annotation
    to specify the database table which Hibernate shall use to simulate the sequence.

     */

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //default AUTO
    /*@SequenceGenerator(name = "provaPrimaryKeyGenIdSeq", sequenceName = "myschema.prova_primary_key_gen_id_se", allocationSize = 1, initialValue = 1)*/
    /*@TableGenerator(name="provaPrimaryKeyGenIdSeq", table="prova_primary_key_gen_id_se", schema = "myschema") //non viene creata una sequence, ma una tabella che "simula" una sequence*/
    @Getter
    @Setter
    private UUID id; //se usiamo UUID come generation type, allora il tipo dell'id deve necessariamente essere UUID
}
