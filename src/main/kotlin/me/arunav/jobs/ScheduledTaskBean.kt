package me.arunav.jobs

import io.quarkus.scheduler.Scheduled
import me.arunav.tasks.Task
import javax.enterprise.context.ApplicationScoped
import javax.transaction.Transactional

@ApplicationScoped
class ScheduledTaskBean {

    @Transactional
    @Scheduled(every = "10s", identity = "task-job")
    fun schedule() {
        val task = Task()
        task.persist()
    }
}
