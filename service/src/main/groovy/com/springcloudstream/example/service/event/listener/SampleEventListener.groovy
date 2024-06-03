package com.springcloudstream.example.service.event.listener

import com.springcloudstream.example.service.event.sink.SampleEventListenerSink
import groovy.util.logging.Slf4j
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Component

@Slf4j
@Component
class SampleEventListener {

    @StreamListener(SampleEventListenerSink.FILE_TRANSFER_EVENT_IN)
    void process(Object payload) {
        log.info("Processing inbound {}", payload)

        //TODO: configure smb, configure sftp, transfer zip to sftp
        println("Event heard and output event triggered!")
    }
}
