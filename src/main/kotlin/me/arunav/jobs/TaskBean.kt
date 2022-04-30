package me.arunav.jobs

import io.quarkus.runtime.StartupEvent
import me.arunav.tasks.Task
import org.quartz.Job
import org.quartz.JobBuilder
import org.quartz.JobExecutionContext
import org.quartz.Scheduler
import org.quartz.SimpleScheduleBuilder
import org.quartz.TriggerBuilder
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes
import javax.inject.Inject

//@ApplicationScoped
//class TaskBean {
//
//    @Inject
//    lateinit var quartzScheduler: Scheduler
//
//    fun onStart(@Observes event: StartupEvent) {
//        // Building the job object
//        val job = JobBuilder.newJob(MyJob::class.java)
//            .withIdentity("myJob", "myGroup")
//            .build()
//
//        // Building the trigger
//        val trigger = TriggerBuilder.newTrigger()
//            .withIdentity("myTrigger", "myGroup")
//            .startNow()
//            .withSchedule(
//                SimpleScheduleBuilder.simpleSchedule()
//                    .withIntervalInSeconds(10)
//                    .repeatForever()
//            )
//            .build()
//
//        // Scheduling the job with the specified trigger
//        quartzScheduler.scheduleJob(job, trigger)
//    }
//
//    fun performTask() {
//        val task = Task()
//        task.persist()
//    }
//}
//
//class MyJob : Job {
//
//    @Inject
//    lateinit var taskBean: TaskBean
//
//    override fun execute(context: JobExecutionContext?) {
//        taskBean.performTask()
//    }
//}
