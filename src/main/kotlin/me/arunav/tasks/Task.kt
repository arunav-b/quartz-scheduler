package me.arunav.tasks

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import java.time.Instant
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "TASKS")
class Task : PanacheEntity {

    var createdAt: Instant

    constructor() {
        createdAt = Instant.now()
    }

    constructor(time: Instant) {
        this.createdAt = time
    }

    companion object : PanacheCompanion<Task>
}
