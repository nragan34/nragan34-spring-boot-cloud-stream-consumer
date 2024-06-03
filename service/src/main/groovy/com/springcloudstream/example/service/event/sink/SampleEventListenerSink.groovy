package com.springcloudstream.example.service.event.sink

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.SubscribableChannel

interface SampleEventListenerSink {
    static final String FILE_TRANSFER_EVENT_IN = "fileTransferEvent-in"

    @Input(SampleEventListenerSink.FILE_TRANSFER_EVENT_IN)
    SubscribableChannel input()
}
