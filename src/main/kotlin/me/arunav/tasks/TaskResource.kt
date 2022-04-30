package me.arunav.tasks

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/task")
class TaskResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello Quartz Scheduler"

    @GET
    fun listAll() = Task.listAll()
}
