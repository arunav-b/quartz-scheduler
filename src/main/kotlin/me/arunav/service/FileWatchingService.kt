package me.arunav.service

import java.nio.file.FileSystems
import java.nio.file.Paths
import java.nio.file.StandardWatchEventKinds.ENTRY_CREATE
import java.nio.file.StandardWatchEventKinds.ENTRY_DELETE
import java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY
import java.nio.file.WatchService

class FileWatchingService {

    private val DIRECTORY_PATH = "/Users/arunav/Documents/workspace/scheduler-file-watcher"

    fun poll() {
        val watchService: WatchService = FileSystems.getDefault().newWatchService()
        Paths.get(DIRECTORY_PATH)
            .register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY)
        while (true) {
            val watchKey = watchService.poll()
            if (watchKey != null) {
                for (event in watchKey.pollEvents()) {
                    println("Event kind = ${event.kind()}, Event.context = ${event.context()}")
                }
                watchKey.reset()
            }
        }
    }
}

fun main() {
    FileWatchingService().poll()
}
